package com.zixue.single_;
/*
演示懒汉式的单例模式
 */

public class SingleTon02 {
    public static void main(String[] args) {
        Cat  instance= Cat.GetInstance();
        System.out.println(instance);

//        再次调用instance，
        Cat  instance1= Cat.GetInstance();
        System.out.println(instance1);
    }
}

//要求：  希望在运行过程中，只能养一只猫
//要求：  使用单例模式
class Cat{
private String name;
public int n1=999;
private static Cat cat ;  //默认是null

//步骤
//    1、构造器私有化 。 防止用户在类的外部直接new
//    2、类的内部创建对象
//    3、提供一个静态的static公共public法，可以返回一个Cat对象
   private Cat(String name) {
        this.name = name;
    }
    public static Cat GetInstance(){
       if (cat==null){  //如果还没有创建cat对象
           cat  =new Cat ("小欢");  //创建一个名字叫小欢的猫的对象
       }
       return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", n1=" + n1 +
                '}';
    }
}