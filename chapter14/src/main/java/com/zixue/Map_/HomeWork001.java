package com.zixue.Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class HomeWork001 {
    public static void main(String[] args) {
        //使用HashMap添加3个员工对象，键：员工ID 。 值：员工对象
        //遍历显示工资》18000的员工
        //员工类：姓名：工资：员工ID
        HashMap map = new HashMap();

        map.put("001",new Emp("jack",500000,123));
        map.put("002",new Emp("mack",100000,125));
        map.put("003",new Emp("tom",300000,127));

        Set keySet = map.keySet();
        for (Object key :keySet) {
            //先获取value
            Emp emp = ( Emp ) map.get(key);
            if (emp.getSal()>100000){
                System.out.println(emp);
            }

        }
//        使用EntrySet----》迭代器
        //体现了一个包裹了
        Set entrySet = map.entrySet();
        System.out.println("================================");
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =(Map.Entry) iterator.next();
            //通过entry获取key和value
           Emp emp =(Emp) entry.getValue();
           if (emp.getSal()>100000){
               System.out.println(emp);
           }
        }

    }
}
class Emp{
    private String name ;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}