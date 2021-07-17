package com.zixue.static_;

import java.util.Collection;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        tom.payFee(100);//tom交了100块钱

        Stu mary = new Stu("mary");//mary
        mary.payFee(200);     //Mary交了200块钱

         //输出现在收到的总的学费
        Stu.showFee();      //输出总的学费


    }
}
//开发自己的工具类，可以做成静态的，方便使用
class Stu{
    private String name;//1、先定义一个名字普通成员变量
    //2、定义一个静态变量来累积学生的学费
    private static double fee=0;
//写一个构造器
    public Stu(String name) {
        this.name = name;
    }
    public static void payFee(double fee){  //静态变量来累积学费
        Stu.fee+=fee;//累积
    }
    public static void showFee(){
        System.out.println("总学费是="+Stu.fee);
    }
}





