package com.zixue.enumeration_.Homework;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */

//创建交通工具工厂类，用两个方法分别获得交通工具 Horse、Boat
    //马一直 跟着唐僧是一匹马

public class VehiclesFactory {
    private static Horse horse;

    private VehiclesFactory() {
    }

    public static Horse getHorse(){
        return new Horse();
    }
    public static Boat getBoat(){
        return new Boat();
    }
}
