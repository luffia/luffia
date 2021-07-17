package com.zixue.enumeration_.Homework;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork05 {
    public static void main(String[] args) {
        Person Tang = new Person("唐僧", new Horse());
        Tang.common();  //一般情况下
        Tang.PassRiver();//过河
        Tang.common();  //一般情况下
        Tang.common();  //一般情况下
    }
}
//有一个交通工具接口Vehicles类，有work接口
//      Horse类和Boat类分别实现Vehicles
//     创建交通工具工厂类，用两个方法分别获得交通工具 Horse、Boat
//有Person类，name，Vehicles属性，在构造器中为俩属性赋值
// 实例化Person对象“唐僧”要求一般情况用  Horse遇到大河时用Boat

