package com.zixue.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 *
 * 演示通过反射机制创建实例
 */
public class ReflectionCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//
//        1、先获取到User 类的Class对象
        Class<?> userClass = Class.forName("com.zixue.reflection.User");
//
//        2、通过 public 的无参构造器 创建实例
        Object o = userClass.newInstance();
        System.out.println(o);
//
//        3、通过 public 的有参构造器 创建实例
        /* 这里的 constructor 对象是下面这句话
        *  public User( String name) {////public  有参构造器
            this.name = name;
    }
    * 3、1 先得到对应的构造器
    * 3、2 再创建实例
    * 3、3   最后传入参数
        * */
        Constructor<?> constructor = userClass.getConstructor(String.class);//得到一个公有的构造器,将数据类型传进去
        Object zxh = constructor.newInstance("张小花");//后面传进去具体的参数也就是 name
        System.out.println("张小花="+zxh);//张小花=User{age=10, name='张小花'}
//
//
//        4、通过  非public 的有参构造器 创建实例
//        getDeclaredConstructor 可以获取所有的构造器方法
        //4-1   先得到私有的   private   构造器对象
//        4-2   创建实例
//   使用 constructor1.setAccessible(true); 进行 爆破！！【暴力破解】使用反射可以访问私有的  private 构造器
        Constructor<?> constructor1 = userClass.getDeclaredConstructor(int.class,String.class);
        constructor1.setAccessible(true);// 爆破！！使用反射可以访问私有的  private 构造器
        Object user2 = constructor1.newInstance(100, "zhang");
        System.out.println("user2="+ user2);//user2=User{age=100, name='zhang'}
    }

}
class User{
    private int age=10;
    private String name="张小花" ;

    public User() {//public  无参构造器
    }

    public User( String name) {////public  有参构造器
        this.name = name;
    }

   private User(int age, String name) { //非public  有参构造器
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}