package com.zixue.final_;

public class homework001 {
    public static void main(String[] args) {

    }
}
//    编写一个程序，能够计算圆的面积，圆周率3.14，赋值的位置3个
class Circle {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }
}
