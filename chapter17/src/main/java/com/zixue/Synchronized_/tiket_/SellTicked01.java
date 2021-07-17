package com.zixue.Synchronized_.tiket_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * <p>
 * 使用实现Runnable接口方式做售票系统
 */
public class SellTicked01 {
    public static void main(String[] args) {
        SellTicked03 sellTicked03 = new SellTicked03();// 他们同时操作 SellTicked02  所以共享 TicketNum
        new Thread(sellTicked03).start();//第一个线程窗口
        new Thread(sellTicked03).start();//第二个线程窗口
        new Thread(sellTicked03).start();//第三个线程窗口



    }
}

//模拟售票系统，模拟三个窗口售票100，分别使用继承Thread 和实现Runnable接口方式
//并分析有什么问题

//   使用Synchronized

class SellTicked03 implements Runnable {
    private int TicketNum = 100;
    private boolean loop = true;

    //如果这样写也是可以的，对象不一定是this，只要是同一个就可以,必须是同一个对象
    Object object = new Object();

    //如果在静态方法中，实现一个同步代码块.把锁加在类本身上，而不是加 this
    public synchronized static void m1(){
    }
    public static void m2(){
        synchronized (SellTicked03.class){
            System.out.println("m2");
        }
    }

//    老师说明：1、 public synchronized void sell()是一个同步方法
//            2、 这时锁在 this  对象
//            3、也可以在代码块上写 synchronized 同步代码块


    /**
     * //第一种方法：互斥锁加在方法上
     * <p>
     * //synchronized 要用小写的才不会出错
     * public synchronized void sell() {//同步方法，在同一时刻，只能又一个线程来执行 run 方法
     * <p>
     * if (TicketNum <= 0) {
     * System.out.println("售票结束。");
     * loop = false;
     * return;
     * }
     * try {
     * Thread.sleep(80);
     * } catch (InterruptedException e) {
     * e.printStackTrace();
     * }
     * System.out.println("窗口" + Thread.currentThread().getName() +
     * "售出一张票" + "剩余票数=" + (--TicketNum));
     * }
     *
     * @Override public void run() {
     * while (loop) {
     * sell();//sell方法是一种同步方法
     * }
     * }
     * }
     */


    //         第二中方法，加在代码块中
    public void sell() {

        synchronized (/*this*/ object) {  //三个线程 操作的是同一个object
            if (TicketNum <= 0) {
                System.out.println("售票结束。");
                loop = false;
                return;
            }
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() +
                    "售出一张票" + "剩余票数=" + (--TicketNum));
        }
    }

    @Override
    public void run() {
        while (loop) {
            sell();//sell方法是一种同步方法
        }
    }
}