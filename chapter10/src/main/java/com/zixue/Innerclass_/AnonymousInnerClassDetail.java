package com.zixue.Innerclass_;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}
class Outer05{
    private int n1=100;
    public void f1(){
        //创建一个基于类的匿名内部类方法体外必须有分号
     Person p =  new Person(){
         @Override
         public void hi() {
             System.out.println("匿名内部类重写类  hi方法");
         }

     };
        p.hi();//动态绑定，真实的运行类型是Outer05$1

//        也可以直接调用
        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写哈哈哈");
            }

            @Override
            public void ok(String name) {
                super.ok(name); //父类，所以运行System.out.println("Person ok哈哈哈哈"+name)然后加上jack
            }
        }.ok("jack"); //输出Person ok哈哈哈哈jack    如果是.hi()结果也是可以按代码运行
    }


}
class Person{  //类
    public void hi(){  //方法
        System.out.println("Person 的hi()");
    }
    public void ok(String name){
        System.out.println("Person ok哈哈哈哈"+name);
    }
}
//接口/内部类的形式一样