package com.zixue.Collections_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork0002 {
    public static void main(String[] args) {
        //使用ArrayList完成对象Car{ name,price}操作
        /*
        add:添加单个元素
        remove:删除指定元素
        contains:查找元素是否存在
        size:获取元素个数
        isEmpty:判断是否为空
        clear:清空
        addAll:添加多个元素
        containsAll:查找多个元素
        removeAll:删除多个元素
        使用增强for和迭代器遍历Car，重写To String
        */
        ArrayList list = new ArrayList();

        Car car=new Car("宝马",4000000);
        Car car1=new Car("宾利",5000000);

        //        add:添加单个元素
        list.add(new Car("大众",123456) );
        list.add(car);
        list.add(car1);
        System.out.println(list);

        // remove:删除指定元素
        list.remove(car);
        System.out.println(list);

        // contains:查找元素是否存在
        System.out.println(list.contains(car));//f


        //size:获取元素个数
        System.out.println(list.size());//2

//        isEmpty:判断是否为空
        System.out.println(list.isEmpty());
//
//        addAll:添加多个元素
        System.out.println(list);
        list.addAll(list);
        System.out.println(list);
//        containsAll:查找多个元素
        list .containsAll(list);
        System.out.println(list);
//       循环遍历
        for (Object o :list) {
            System.out.println(o);
        }
        System.out.println("============================");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
class Car{
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}