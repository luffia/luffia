package com.zixue;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Car {
    public String brand="bwm";
    public int price=900000;
    public String color="red";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
