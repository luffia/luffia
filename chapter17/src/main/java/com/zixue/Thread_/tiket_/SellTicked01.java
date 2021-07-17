package com.zixue.Thread_.tiket_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 *
 * 使用实现Runnable接口方式做售票系统
 */

//因为是一个对象，都是操作这个售票系统所以实现一个就可以

//出现的问题：票再次被超卖了


public class SellTicked01 {
    public static void main(String[] args) {
        SellTicked02 sellTicked02 = new SellTicked02();// 他们同时操作 SellTicked02  所以共享 TicketNum
        new Thread(sellTicked02).start();//第一个线程窗口
        new Thread(sellTicked02).start();//第二个线程窗口
        new Thread(sellTicked02).start();//第三个线程窗口
    }
}
//模拟售票系统，模拟三个窗口售票100，分别使用继承Thread 和实现Runnable接口方式
//并分析有什么问题
class SellTicked02 implements Runnable {
private  int TicketNum=100;
    @Override
    public void run() {
        while (true) {
            if (TicketNum <= 0) {
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "张票" + (--TicketNum));
        }
    }
}