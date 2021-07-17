package com.zixue;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Cat {
   public String name="招财猫";
   public int age=10;
   public Cat(){};//无参构造器
    public Cat(String name){//有参构造器
        this.name=name;
    }
    public void hi(){
//        System.out.println("hi"+name);
    }
public void cry(){
    System.out.println(name+"喵喵喵。。。。。");
}
}
