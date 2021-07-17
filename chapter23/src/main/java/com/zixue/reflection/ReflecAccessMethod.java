package com.zixue.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * 演示通过反射调用方法
 */
public class ReflecAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//      1、得到 Boss 类对应的 Class 对象
        Class<?> bossCls = Class.forName("com.zixue.reflection.Boss");

//        2、创建对象
        Object o = bossCls.newInstance();

//        3、调用 hi 方法
        Method hi = bossCls.getMethod("hi",String.class);
        hi.invoke(o,"张小花吃粑粑");// hi张小花吃粑粑

//        4、调用 say 方法
//         步骤
//        4-1、得到 say方法  私有方法
        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
//        4-2 私有方法进行爆破
        say.setAccessible(true);
//        4-3  调用 say 方法，并传入具体参数
        say.invoke(o,100,"花小花",'男');
//        4-4  输出
        System.out.println(say.invoke(o,100,"花小花",'男'));//100 花小花 男

//        注意：在反射中，如果方法有返回值，统一返回Object
        Object reVal = say.invoke(null, 300, "大华", '男');
        System.out.println("reVal的运行类型="+reVal.getClass());//reVal的运行类型=class java.lang.String
    }
}
class Boss{
    public int age;
    private static String name ;

    public Boss() {
    }

    private static String  say(int n,String s,char c) {
        return n+" "+ s+" "+c;
    }
    public void hi(String s){
        System.out.println("hi"+s);
    }
}