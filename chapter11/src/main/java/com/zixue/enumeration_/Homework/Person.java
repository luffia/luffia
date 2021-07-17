package com.zixue.enumeration_.Homework;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */

//有Person类，name，Vehicles属性，在构造器中为俩属性赋值
//
public class Person {
    private String name;
    private Vehicles vehicles;

//    在创建人对象时事先给他分配一个交通工具
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    // 实例化Person对象“唐僧”要求一般情况用  Horse遇到大河时用Boat
    //这里有个编程思想就是把具体的要求封装成方法
    //如何不浪费在构建对象时传入 的交通工具
    public void PassRiver(){
        //先得到船
//        Boat boat=VehiclesFactory.getBoat();  //从工厂里拿到一艘船
//        boat.work();                          //船工作
        //如何防止一直传入的都是马儿所以要用 instanceOf
        //if(vehicles==null){
        //vehicles instanceof Boat 是判断 当前的vehicles是不是Boat
        //（1）vehicles=null：vehicles instanceof Boat=》false
        //（2）vehicles=马对象：vehicles instanceof Boat=》false
        //（3）vehicles=船对象：vehicles instanceof Boat=》true
      if (!(vehicles instanceof Boat)){//判断当前是不是空
            vehicles=VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void common() {//从工厂得到一个人
        //判断一下当前属性是否已经纯在了Vehicles
        if (!(vehicles instanceof Horse)) {//这里使用的是接口
           vehicles=VehiclesFactory.getHorse();//这里使用的是多态
        }
        vehicles.work();//如果是空的就获取一匹马工作
    }
}
