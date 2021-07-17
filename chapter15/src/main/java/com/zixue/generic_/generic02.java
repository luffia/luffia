package com.zixue.generic_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */

//该数据类型在定义person对象时指定，即在编译期间，就确定E是什么类型
public class generic02 {
    public static void main(String[] args) {
        Person<String> stringPerson = new Person<String>("小花多多多");
        //就相当于String替换掉了E
    }
}
class Person<E>{
    E s;////E表示数据类型，该数据类型在定义person对象时指定，即在编译期间，就确定E是什么类型

    public Person(E s) {//E也可以是参数类型
        this.s = s;
    }
    public E f(){//E返回类型使用
        return s;
    }
}