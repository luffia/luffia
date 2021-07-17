package com.zixue.homework_;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Homework01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        /**定义 Private Test类 私有name属性，值为helloKitty
         提供getName公有方法
         创建PrivateTest的类，利用Class类得到私有的name属性，修改私有的name属性值
         并调用getName（）的方法打印 name属性值
         * */
//          1  得到 Class 类对象
        Class<PrivateTest> privateTestClass = PrivateTest.class;

        // 2 创建 Private Test类
        PrivateTest privateTestObj = privateTestClass.newInstance();
//
//        3、Class类得到私有的name属性
        Field name = privateTestClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(privateTestObj,"张小花～");

//        4  调用getName（）的方法打印 name属性值
        Method getName = privateTestClass.getMethod("getName");
//        因为getName（）是public的所以直接调用
        Object invoke = getName.invoke(privateTestObj);
        System.out.println("name 的属性值="+invoke);
    }
}
class PrivateTest{
    private String name="hellKitty";

    public String getName(){
        return name;
    }
}