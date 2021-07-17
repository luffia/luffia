package com.zixue.Synchronized_.HomeWork_;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class HomeWork001 {
    public static void main(String[] args) {
        //1、在 main 启动两个线程
        //   在第一个线程循环随机打印100以内的整数，直到第二个线程从键盘读取了 “Q” 命令
        A a = new A();
        B b = new B(a);  //一定要将 a 传进去才能控制
        a.start();
        b.start();
    }
}
//1、 创建AA线程
class A extends Thread{
    private  boolean loop=true;
    @Override
    public void run() {
       // super.run();
        while (loop){
            System.out.println((int) (Math.random()*100+1));
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A 线程退出。。。。");
    }
//提供一个 setLoop 的方法使B 线程可以修改AA线程修改loop变Q量
    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
//直到第二个线程从键盘读取了 “Q” 命令
class B extends Thread{
    private A a;
 private Scanner scanner= new Scanner(System.in);

    //z在构造器中直接传入A对象
    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
     //   super.run();
        //接收一个用户输入
        while (true) {
            System.out.println("请输入你的指令（Q） 表示退出：");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key=='Q'){
                a.setLoop(false);
                System.out.println("B 线程退出。。。");
                break;
            }
        }
    }
}