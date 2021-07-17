package com.zixue.Set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class HashSet01HomeWork {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Employee("milan",16));
        set.add(new Employee("jake",17));
        set.add(new Employee("milan",16));
        //先比较hash值，因为值都不相同所以搜可以加进去
        System.out.println(set);
    }
}
// 定义一个Employee类，包含private 属性成员 name，age
//1、创建3个Employee对象放入HashSet中
//2、当name和age值相同时就认为是相同的员工，不能添加到HashSet集合中去
class Employee{
    private String name ;
    private int age;

    public Employee(String name, int age) {
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}