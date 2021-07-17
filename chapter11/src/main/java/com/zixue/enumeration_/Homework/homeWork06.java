package com.zixue.enumeration_.Homework;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork06 {
    public static void main(String[] args) {

        //实例化不同Car对象的写法
        Car car = new Car(50);
        car.getAir().flow();     //调用空调，然后吹什么风

        Car car1 = new Car(-90);
        car1.getAir().flow();

        Car car2 = new Car(30);
        car2.getAir().flow();
    }
}
//Car类，属性temperature，车内有Air类，有吹风功能flow
//Air会监视车内温度，超过40度吹冷气，低于0度吹暖气，如果在这之间关掉空调，实例化具有不同温度的Car对象
//  ，调用空调flow方法，测试空调吹的风是否正确
class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{  //成员内部类
       public void flow(){
           if (temperature>40){
               System.out.println("温度大于40，吹冷风。。");
           }else if (temperature<0){
               System.out.println("温度小于0，吹暖风。。");
           }else {
               System.out.println("温度正常，关闭空调。。");
           }
       }
    }
    public  Air getAir(){
       return new  Air();
    }
}