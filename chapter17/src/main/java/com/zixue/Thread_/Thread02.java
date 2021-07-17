package com.zixue.Thread_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * 通过实现  Runnable  接口，  来开发线程
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();  //静态代理
    }
}
//编写程序，该程序可以每隔1秒，在控制台打印输出“hello”，当输出10次后，自动退出
//使用实现Runnable接口的方式
class Dog implements Runnable{

    @Override
    public void run() {
        int times =0;

        while(true){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (times == 10){
            break;
        }
            System.out.println("小狗汪汪叫。。。。"+  ++times);
    }
    }
}