package com.zixue.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork001 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //创建3个Dog{name,age}对象，放在ArrayList数组中，赋给List引用
        //用迭代器和增强for 循环两种方式来遍历
        //重写Dog的toString方法，输出name和age
           ArrayList list = new ArrayList();
        list.add(new Dog("小黄", 13));
        list.add(new Dog("小百", 23));
        list.add(new Dog("小蓝", 3));

        //迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        System.out.println("========for循环============");
        for (Object o : list) {
            System.out.println(o);
        }


    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}