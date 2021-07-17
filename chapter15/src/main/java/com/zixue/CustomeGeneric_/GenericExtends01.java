package com.zixue.CustomeGeneric_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class GenericExtends01 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        ArrayList<String > list1 = new ArrayList<>();
        ArrayList<AA> list2 = new ArrayList<>();
        ArrayList<BB> list3 = new ArrayList<>();
        ArrayList<CC> list4 = new ArrayList<>();

//        举例说明下面三个方法的使用
//        1、List<?>c    支持任意泛型类型
        printCollection(list);
        printCollection(list1);
        printCollection(list2);
        printCollection(list3);
        printCollection(list4);

//        2、?extends AA 表示可以接受AA以及AA的子类
//        printCollection1(list); //错误
//        printCollection1(list1);//错误跟AA没关系
//        printCollection1(list2);//OK
//        printCollection1(list3);//OK
//        printCollection1(list4);//OK

//        3、<  ?super A>：支持AA类以及AA类父类。不限于直接父类，规定了泛型的下限
//        printCollection2(list); //OK 因为Object是所有人的父类
//        printCollection2(list1);//错误跟AA没关系
//        printCollection2(list2);//OK
//        printCollection2(list3);//错误支持A类的父类，BB是AA类的子类
//        printCollection2(list4);//错误错误支持A类的父类，BB是AA类的子类


    }
//    List表示任意的泛型类型都可以接收printCollection打印集合
    public static void printCollection(List<?>c){
        for (Object object:c){//通配符，取出时就是Object
            System.out.println(object);
        }
    }
    //?extends AA 规定了泛型的上限表示可以接受AA以及AA的子类
    public static void printCollection1(List<? extends AA>c){
        for (Object object :c) {
            System.out.println(object);
        }
    }
    //<  ?super A>：支持A类以及A类父类。不限于直接父类，规定了泛型的下限
    public static void printCollection2(List<? super AA>c){
        for (Object object :c) {
            System.out.println(object);
        }

    }
}
class AA{
}
class BB extends AA {

}
class CC extends BB{

}