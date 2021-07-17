package com.zixue.generic_;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
@SuppressWarnings({"all"})
public class homeWork01 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 200, new MyDate(1999, 2, 10)));
        employees.add(new Employee("jack", 500, new MyDate(1993, 7, 1)));
        employees.add(new Employee("tom", 800, new MyDate(1991, 5, 5)));
        System.out.println(employees);
        //进行排序先按照name
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                //先对两个对象进行判断是不是正确的对象
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {
                    System.out.println("输入不对");//先比较运行类型是不是Emplyee
                    return 0;
                }
                int i = emp1.getName().compareTo(emp2.getName());//如果输入正确进行比较,比较完后会返回一个值
                if (i != 0) {//如果名字不相同就直接返回一个i
                    return i;
                }
                //对生日的年月日进行封装，最好放在MyDay里面进行,在主方法中直接返回结果
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });
        System.out.println("===================================");
        System.out.println(employees);
    }
}
