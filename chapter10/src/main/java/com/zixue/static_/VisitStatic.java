package com.zixue.static_;

public class VisitStatic {
    public static void main(String[] args) {
        // 类名 . 类变量名
        //直接调用
        //类变量是随着类的加载而创建，所以即使没有创建对象实例也可以访问
        System.out.println(A.name);
    }
}
//定义一个A类
class A{
    //静态变量书写方法： 访问修饰符   static  数据类型  变量名；
    public static String name="下雨";  //类变量的访问要遵守相关的访问权限
    /// private static String name="下雨";  这样书写就不能被上面的A.name访问
}