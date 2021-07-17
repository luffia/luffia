package com.zixue.reflection;

import sun.jvm.hotspot.debugger.win32.coff.TestDebugInfo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 * 演示如何通过 反射 获取 类结构  信息
 */
public class ReflectionUtils {
    public static void main(String[] args) {

    }

    //    第一组 方法  API
    public void api_01() throws ClassNotFoundException {
//      Class.forName 得到Class对象
        Class<?> personCls = Class.forName("com.zixue.reflection.Person");
//
//     .getName()   获取全类名
        System.out.println(personCls.getName());
//
//       getSimpleName() 获取简单类名
        System.out.println(personCls.getSimpleName());
//
//      personCls.getFields() ; 获取所有 public 修饰的属性，包含本类以及父类的
        Field[] fields = personCls.getFields();
        for (Field field : fields) {
            System.out.println("本类以及父类的属性=" + field.getName());
        }
//
//       personCls.getDeclaredFields() 获取本类中所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类以及父类所有的属性=" + declaredField.getName());
        }
//
//        personCls.getMethods();获取所有 public 修饰的 方法，包含本类以及父类的
        Method[] methods = personCls.getMethods();
        for (Method method : methods) {
            System.out.println("本类及父类的公有方法=" + method.getName());
        }

//       personCls.getDeclaredMethods(); 获取本类中所有的  方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Field declaredField : declaredFields) {
            System.out.println("本类及父类的方法=" + declaredField.getName());
        }
//       personCls.getConstructors(); 获取所有 public 修饰的 构造器，本类的
        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("本类及父类的构造器=" + constructor.getName());
        }
//       personCls.getDeclaredConstructors(); 获取本类中所有的  构造器
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("本类及父类的构造器=" + declaredConstructor.getName());
        }
//       personCls.getPackage() 以Package 形式返回 包信息
        System.out.println(personCls.getPackage());

//        personCls.getSuperclass() 以Class形式返回 父类信息
        Class<?> superclass = personCls.getSuperclass();
        System.out.println("父类的class对象=" + superclass);
//
//        personCls.getInterfaces(); 以Class【】形式返回接口信息
        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("接口信息=" + anInterface);
        }
//
// 以Annotation 【】形式 返回注解信息
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("注解信息=" + annotation);
        }
    }
}

class A {
    public String hobby;

    public void hi() {

    }

    public A() {
    }
}

interface IA {

}

interface IB {

}

class Person extends A implements IA, IB {

    //    属性
    public String name;
    protected int age;
    String job;
    private double sal;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    //方法

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void m1() {

    }

    protected static void m2() {

    }

    void m3() {

    }

    private void m4() {

    }

}
