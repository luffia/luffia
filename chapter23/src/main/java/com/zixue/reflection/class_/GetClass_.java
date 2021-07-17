package com.zixue.reflection.class_;

import com.zixue.Car;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {
//        1、Class.forName
        String classAllPath = "com.zixue.Car";
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1); //class com.zixue.Car

//      2、类名.class   应用场景： 用于参数传递
        Class<Car> cls2 = Car.class;
        System.out.println(cls2);  //class com.zixue.Car

//        3、对象.getClass（ ）  应用场景：有对象实例
        Car car = new Car();
        Class<? extends Car> cls3 = car.getClass();
        System.out.println(cls3);  //class com.zixue.Car

//        4、通过  类加载器 【4种】来获取到 类的 Class对象
//        （1）先得到类加载器 car
        ClassLoader classLoader = car.getClass().getClassLoader();
//        (2)通过 类加载器 得到Class对象
        Class<?> cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);   //class com.zixue.Car
        //cls1  cls2   cls3   cls4 是同一个对象，
        System.out.println(cls1.hashCode());   //692404036
        System.out.println(cls2.hashCode());   //692404036
        System.out.println(cls3.hashCode());   //692404036
        System.out.println(cls4.hashCode());   //692404036

//        5、基本数据（int，char，boolean，float，double，byte，long，short）
//           按照如下方式获得  Class 对象
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);//int
        System.out.println(characterClass);//char
        System.out.println(booleanClass);//boolean

//        6、基本数据类型对应的   包装类    ，可以通过  .TYPE 得到 Class 对象
//              其他包装类 一样的方法a
        Class<Integer> type = Integer.TYPE;
        Class<Character> type1 = Character.TYPE;
        System.out.println(type);//int
        System.out.println(type1);//char

        System.out.println(integerClass.hashCode());//692404036
        System.out.println(type.hashCode());  //692404036

    }

}
