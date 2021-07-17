package com.zixue.Innerclass_;

public class AnonymousInnerClassExercise01 {
    public static void main(String[] args) {
//可以当作实参直接传递，简洁高效
        f1(new AA() {
            @Override
            public void show() {
                System.out.println("这是一个名画。。。");
            }
        });
    }

    //静态方法,行参是接口的类型
    public static void f1(AA aa) {
        aa.show();  //aa的编译类型是AA
    }
}

//接口
interface AA {
    void show();
}