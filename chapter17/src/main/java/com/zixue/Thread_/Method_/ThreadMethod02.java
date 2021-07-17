package com.zixue.Thread_.Method_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        X x01 = new X();
        x01.start();
        for (int i = 0; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程吃了" + i + "个包子。。。。。。");
            if (i == 5) {
                System.out.println("主线程 （小弟） 让 子线程 （老大） 先吃");
//
//                //join  线程插队 是一定会成功的
//                x01.join();
//                System.out.println("子线程 （ 老大）吃完了 我们 主线程 （小弟）再吃");

//                yield() 礼让，但不一定成功
                Thread.yield();
                System.out.println("（老大）子线程吃完了  主线程（小弟）接着吃。。。。。。。");
            }
        }
    }
}

class X extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程吃了。。" + i + "个包子。。。。。。");
        }
    }
}