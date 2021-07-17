package com.zixue.enumeration_.Homework;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork01 {
}
//1、在Frock类中声明私有的静态属性currentNum【int】类型，初始值=100000，作为衣服出场的序列号起始值
//2、声明共有静态方法getNextNum，作为生成上衣唯一序列号的方法，获取序列号并打印输出
//3、在TestFrock类的main方法中，分两次调用getNextNum方法，获取序列号并打印出
//4、在Frock类中声明serialNumber序列号属性，并提供对应的get方法
//5、Frock类的构造器中，通过调用getNextNum方法为Frock对象获取唯一序列号
//赋给serialNumber属性
//6、在TestFrock类main方法中，分别创建三个Frock对象，打印三个对象的序列号，验证是否为按100递增
class Frock{
    private static int currentNum=100000;
    private int serialNumber;
    public int getSerialNumber() {
        return serialNumber;
    }
    public Frock(){
        serialNumber=getNextNum();
    }
    public static int getNextNum(){
        currentNum+=100;//将currentNum增加到100
        return currentNum;
    }
}
class TestFrock{
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());//100100
        System.out.println(Frock.getNextNum());//100200
        Frock frock = new Frock();  //序列号就是100300
        Frock frock1 = new Frock();// //序列号就是100400
        Frock frock2 = new Frock(); //序列号就是100500
        System.out.println(frock.getSerialNumber());//100300
        System.out.println(frock1.getSerialNumber());//100400
        System.out.println(frock2.getSerialNumber());//100500
    }
}