package com.zixue.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        BBB bbb = new BBB();//执行结果：1、父类   AAA的普通代码块被调用。。2、父类   AAA的无参构造器被调用。。。
//                                      3、子类   BBB的普通代码块被调用 4、子类   的无参构造器被调用

//                                   特别强调：当有静态构造器时，先调用静态构造器再根据上面执行顺序执行
    }
}
class AAA{
    {
        System.out.println("父类   AAA的普通代码块被调用。。");

    }

    public AAA() {
        //super（）
        //调用本类代码块
        System.out.println("父类   AAA的无参构造器被调用。。。");
    }
}
class BBB extends AAA{
     {
        System.out.println("子类   BBB的普通代码块被调用");
    }
    public BBB() {
        //super（）
        //调用本类代码块
        System.out.println("子类   的无参构造器被调用");
    }
}