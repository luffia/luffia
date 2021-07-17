package com.zixue.Set_.LinkedHashSet01;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */

@SuppressWarnings({"all"})
public class LinkedHashSet001 {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        // LinkedHashSet的底层源码
        set.add(new Car("奥拓", 1000));//OK
        set.add(new Car("奥迪", 10000));//OK
        set.add(new Car("保时捷", 30000));//OK
        set.add(new Car("奥拓", 1000));//不能添加
        set.add(new Car("法拉利", 320000));//OK
        set.add(new Car("奥拓", 1000));//不能添加

        System.out.println(set);
    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    //c重写HashCode跟equals方法
    //如果name跟price相同就返回相同的HashCode值  equals就返回true

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
/**
 * 最后输出结果为
 * Car{name='奥拓', price=1000.0},
 * Car{name='奥迪', price=10000.0},
 * Car{name='保时捷', price=30000.0},
 * Car{name='法拉利', price=320000.0}]
 * 输入顺序跟取出顺序是一样的
 * */
