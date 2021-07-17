package com.zixue.enumeration_.Homework;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork02 {
    public static void main(String[] args) {
        Animal cat = new Cat();
       Animal dog = new Dog();//将编译类型做成父类
       cat.shout();
       dog.shout();
    }
}
//、动物类Animal包含了抽象方法shout（）   访问修饰符   abstract  类名{   }
//Cat类继承了Animal。并实现方法shout，打印“猫会喵喵叫”
//Dog类继承了Animal，并实现方法shout，打印狗会汪汪叫“
//在测试类中实例化对象Animal cat=new Cat（）并调用cat的shout方法
//在测试类中实例化对象Animal=new Dog（）并调用dog的shout方法
abstract class Animal{
public  abstract void shout();
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("小猫会喵喵喵");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("小狗会汪汪汪");
    }
}