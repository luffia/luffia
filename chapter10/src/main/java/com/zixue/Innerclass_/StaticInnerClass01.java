package com.zixue.Innerclass_;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer07 outer07 = new Outer07();
        outer07.m1();

        //外部其他类 访问  静态内部类
//        方式一
        //因为是静态内部类，是可以通过类名直接访问（前提是满足访问权限）
        Outer07.Inner07 inner07 = new Outer07.Inner07();
        inner07.say();

        //方式二
        //编写一个方法可以返回静态内部类的实例
        Outer07.Inner07 inner071 = outer07.getInner07();
        inner071.say();

        //第三种
        Outer07.Inner07 inner07_ = Outer07.getInner07_();
        inner07.say();
    }
}

class Outer07{
    private int n1=22;
    private static String name="张三";
     //Inner07是一个成员静态内部类，放在外部类的成员位置
    //使用static修饰
    static class Inner07{    //可以添加任意的访问修饰符public  等
        private static String name="贾宝玉";
        //如果外部类和静态内部类重名的成员重名时，静态内部类访问时遵循就近原则，如果想访问外部类的成员，则可以使用
         //外部类名.成员
      public void say(){
            System.out.println(name+"\n"+ "外部类="+Outer07.name);
        }
    }
    public void m1(){   //外部类----》访问----〉静态内部类    访问方式：创建对象，再访问
        Inner07 inner07 = new Inner07();
        inner07.say();

    }
    public  Inner07 getInner07(){//方法二的编写
        return  new Inner07();
    }
    public static Inner07 getInner07_(){  //静态的方法
        return  new Inner07();
    }
}
