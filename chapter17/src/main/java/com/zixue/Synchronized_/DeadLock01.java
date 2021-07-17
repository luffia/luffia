package com.zixue.Synchronized_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class DeadLock01 {
    public static void main(String[] args) {
//        模拟 死锁 现象 一定要避免
        DeadLockDemo A = new DeadLockDemo(true);
        A.setName(" A 线程");
        DeadLockDemo B = new DeadLockDemo(false);
        B.setName(" B 线程");
        A.start();
        B.start();
    }
}
class DeadLockDemo extends Thread {
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        //下面业务分析
//        1、如果 flag 为 true ，线程就会先得到/持有 o1 对象锁
//             然后尝试去获取 o2 对象锁
//        2、如果线程 A 得不到 o2 的对象锁，则就会block
//        3、如果 flag 为 false ，线程B 就会先得到/持有 o2 对象锁，容纳后尝试去获取 o1 对象锁
//        4。如果线程 B 得不到 o1 对象锁，就会blocked
        if (flag) {
            synchronized (o1) { //对象互斥锁，下面就是同步锁
                System.out.println(Thread.currentThread().getName() + "进入 1 。。。。。。");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "进入  2。。。。");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + " 进入  3。。。");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + " 进入 4");
                }
            }
        }
    }
}