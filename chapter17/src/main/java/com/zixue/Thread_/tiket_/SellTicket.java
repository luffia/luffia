package com.zixue.Thread_.tiket_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * 模拟三个窗口同时售票继承 Thread
 */
public class SellTicket {
    public static void main(String[] args) {
        SellTicket1 sellTicket1 = new SellTicket1();
        SellTicket1 sellTicket2 = new SellTicket1();
        SellTicket1 sellTicket3 = new SellTicket1();

//        这里会出现票被超卖了
//        窗口Thread-0售出了一张票剩余-1
//        售票结束。。。。。。
//        窗口Thread-1售出了一张票剩余-2
//        售票结束。。。。。。

        sellTicket1.start();//启动售票线程
        sellTicket2.start();//启动售票线程
        sellTicket3.start();//启动售票线程
    }
}
//模拟售票系统，模拟三个窗口售票100，分别使用继承Thread 和实现Runnable接口方式
//并分析有什么问题
class SellTicket1 extends Thread {
    private static int ticketNum =100;
    @Override
    public void run() {
        super.run();
        while (true) {

            if (ticketNum<=0){
                System.out.println("售票结束。。。。。。");
                break;
            }
            //模拟休息50毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口"+Thread.currentThread().getName()+"售出了一张票"+
                             "剩余"+(--ticketNum));
        }
    }
}