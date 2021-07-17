package com.zixue.Thread_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        Thread thread = new Thread(t1);
        thread.start();

        T2 t2 = new T2();
        Thread thread1 = new Thread(t2);
        thread1.start();

    }
}

//编写程序，创建两个线程，一个线程每隔1秒，在控制台打印输出“hello”，当输出10次后，自动退出
//一个线程每隔一秒输出“加油”输出第5次退出
class T1 implements Runnable {

    @Override
    public void run() {
        int count = 0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello....." + (++count));
            if (count == 80)
                break;
        }
    }
}
class T2 implements Runnable{

    @Override
    public void run() {
        int  count=0;
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("加油。。。。。"+(++count));
            if (count==90){
                break;
            }
        }
    }
}