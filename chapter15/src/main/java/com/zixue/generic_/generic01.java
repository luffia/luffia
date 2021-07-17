package com.zixue.generic_;

import java.util.ArrayList;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class generic01 {
    public static void main(String[] args) {
        ArrayList<Dog> list = new ArrayList<Dog>();
        list.add(new Dog("王朝", 10));
        list.add(new Dog("嘻哈", 5));
        list.add(new Dog("大白", 1));

        //不小心添加一只猫
        //   list.add(new Cat("招财",33));//使用泛型就不能添加猫进去
        //遍历
        for (Dog dog : list) {
            System.out.println(dog.getName());
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

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}