package com.zixue.enumeration_.Homework;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork04 {
    public static void main(String[] args) {
        new A().f1();
    }
}
//编写一个类A，定义局部内部类B，B中有个私有fina常量name
//有个方法show（）打印常量name，进行测试
//进阶：A中也有一个私有变量name，在show方法中打印测试
class A {
    private String NAME = "小白菜";

    public void f1() {
        class B {//局部内部类
            private final String NAME = "小红";
            public void show() {
                System.out.println("NAME=" + NAME + "外部类的name=" + A.this.NAME);//如果重名则采用外部类名.this.属性名
            }
        }
        B b = new B();
        b.show();
    }
    }


