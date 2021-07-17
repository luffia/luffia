package com.zixue.Thread_.Method_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        M m = new M();

        //设置线程名称
        m.setName("张华");

        //设置优先级//最低的优先级
        m.setPriority(Thread.MIN_PRIORITY);

//        启动子线程
        m.start();

        //主线程 打印 5 个 加油 ，然后就中断子线程的休眠
        for (int i = 0; i <6; i++) {
            Thread.sleep(1000);
            System.out.println("加油。。。。。"+i);
        }

//        获取 m  线程的优先级
        System.out.println(m.getName()+"线程的优先级="+m.getPriority());

        // interrupt 中断
        m.interrupt();//当执行到这里的时候就会中断这时候的休眠
  }
}
class M extends Thread{
    @Override
    public void run() {
        super.run();
        while (true){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+"吃包子。。。。。"+i);
            }
            try {
                System.out.println(Thread.currentThread().getName()+"休眠中。。。。。。。。。");
                Thread.sleep(8000); ///设置休眠了 5 秒
            } catch (InterruptedException e) {
                e.printStackTrace();
                //当该线程执行到一个 interrupt 方法时，就会 catch 一个异常 ，可以加入到自己的业务代码
                //InterruptedException是捕获到一个中断异常
                System.out.println(Thread.currentThread().getName()+"被  interrupt。。。。。");
            }
        }
    }
}