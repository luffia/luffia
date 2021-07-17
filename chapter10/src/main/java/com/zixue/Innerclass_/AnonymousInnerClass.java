package com.zixue.Innerclass_;

import org.w3c.dom.ls.LSOutput;

//演示匿名内部类使用
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {//  外部类
    private int n1 = 10;  //属性

    public void method() { //方法
        //基于接口的匿名内部类
        //解读
        //1、需求：使用IA接口，并创建对象
        //2、传统方式，写一个类实现该接口，并创建对象
        //3、需求时Tiger类只是使用一次，后面不在使用
        //4、可以使用匿名内部类来简化开发
        //5、Tiger的编译类型是  IA
        //Tiger的运行类型是   匿名内部类，OUter04$1

        /*我们看底层  会分配类名，OUter04$1
        class Outer04$1 implements IA {
        @Override
            public void  cry(){
                System.out.println("老虎叫呼呼。。");
            }* */
        //7、jdk底层在创建匿名内部类OUter04$1，立马就创建类OUter04$1实例，
        //并且把地址反给tiger
        //匿名内部类只使用一次就不在使用
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎呼呼叫。。");
            }
        };
        System.out.println("tiger 的运行类型=" + tiger.getClass());//tiger.getClass()产看运行类型
        tiger.cry();//调用cry
        tiger.cry();//调用cry可以多次调用

        //j基于内部类的匿名类
//        father 的编译类型是Father
        //底层会深层创建匿名内部类，class Outer04$2 extends Father
        //jack的参数列表会自动传送给构造器
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");  //重写后调用输出
            }
        };  //如果没有大括号则运行类型也是Father
        System.out.println("father 的运行类型=" + father.getClass());  //father的运行类型是Outer04$2
        father.test();//调用

        //基于抽象类的匿名内部类
        Animal animal = new Animal(){//抽象类必须要实现
            @Override
            void eat() {
                System.out.println("狗狗吃骨头。。。");
            }
        };
        animal.eat();//调用
    }

}

interface IA {  //接口
    public void cry();
}

//同时也直接返回了匿名内部类Outer04$2
class Father {  //一个类
    public Father(String name) {//构造器
        System.out.println("接收到名字"+name);  //接收到上面的new的名字
    }

    public void test() {    //test方法

    }
}
abstract class Animal{//抽象类
    abstract void eat();//
}