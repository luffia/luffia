package com.zixue.reflection;

import java.lang.reflect.Field;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * 演示 通过反射访问 类中的成员
 */
public class ReflecAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
//   得到 Student 类的对应的 Class对象
        Class<?> stuClass = Class.forName("com.zixue.reflection.Student");
//
//        2、创建对象
        Object o = stuClass.newInstance();//o的运行类型是student
        System.out.println(o.getClass());// 输出;class com.zixue.reflection.Student
//
//        3、用反射 得到 age
        Field age = stuClass.getField("age");
        age.set(o,88);
        System.out.println(o);//  Student [age=88,name=null]

//        4 、使用反射得到name
        Field name = stuClass.getDeclaredField("name");
//        因为是私有属性 所以要先进行爆破
        name.setAccessible(true);
//        设置姓名
        name.set(o,"张小花花");
        System.out.println(o); //Student [age=88,name=张小花花]
    }
}
class Student{

    public int age;
    private static String name ;

    public Student() {  //无参构造器
    }

    @Override
    public String toString() {
        return "Student [age="+age+",name="+name+"]";
    }
}