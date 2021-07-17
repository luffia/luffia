package com.zixue.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
//        类被加载的情况举例说明
        //1、创建对象实例时  new
     //   AA aa = new AA();  //第一种情况的new

        //2、创建子类对像实例，父类也会被加载
      //  AA aa2 = new AA();   //第二种情况的new

        //3、使用类的静态成员时（静态属性，静态方法）
      //  System.out.println(Cat.n1);//  第三种情况
//        DD dd = new DD();   //第四中情况
//        DD dd1 = new DD();   //第四种情况

        //5、如果只是使用类的静态成员时，普通代码块不会执行
        System.out.println(EE.n2);  //第五种情况
    }
}
class EE{
    public static int n2=9000;
    //静态代码块
    static {
        System.out.println("EE的静态代码块5被执行。。。。");//执行结果为：EE的静态代码块5被执行。。。。
    }
    {
        System.out.println("EE的普通代码块");//不执行，因为没有在主方法中new一个新的对象，所以不执行
    }

}
class DD{
    //静态代码块
    static {

        System.out.println("DD的静态代码块4被执行。。。。");  //第四种情况只能调用一次输出：DD的静态代码块4被执行。。。。
    }

}
class Cat{
    public static int n1=100000;  //静态属性

    //静态代码块
    static {
        System.out.println("Cat的静态代码块3被执行。。。。");
    }
}
class BB{
    //静态代码块
    static {
        System.out.println("BB的静态代码块2被执行。。。。"); //结果时先执行父类BB，再执行子类AA
    }
}
class AA extends BB{
//静态代码块
    static {
    System.out.println("AA的静态代码块1被执行。。。。"); //执行
}
}