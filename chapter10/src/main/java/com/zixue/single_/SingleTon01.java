package com.zixue.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        //通过方法可以实现获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);    //GirlFriend{name='小花花花'}

        GirlFriend instance1 = GirlFriend.getInstance();
        System.out.println(instance1);     //GirlFriend{name='小花花花'}

        System.out.println(instance==instance1);    //true
    }
}

//girlfriend
//只能有一个女朋友
class GirlFriend {
    private String name;
    //为了能够再静态方法中返回gf对象，需将其修饰为static
    private static GirlFriend gf = new GirlFriend("小花花花");

    //如何保障我们只鞥创建一个GirlFriend对象
    //步骤【单例模式---饿汉式】
    //1、将构造器私有化
    //2、在类的内部直接创建对象（该对象是static）
    //3、提供一个公共的static方法，返回gf对象
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {   //提供一个公共的static方法，返回gf对象
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}