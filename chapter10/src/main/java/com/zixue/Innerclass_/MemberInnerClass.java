package com.zixue.Innerclass_;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer06 outer06 = new Outer06();
        outer06.t1();

        /*外部其他类，使用成员内部类的三种方式
        第一种
        outer06.new Inner06();相当于把new Inner06（）当作是outer06的成员
        * */
      Outer06.Inner06 inner06 = outer06.new Inner06();
      inner06.say();
       /*
        第二种
      第二种方式 在外部类中编写一个方法，可以返回 Inner06对象
        * */
        Outer06.Inner06 inner06Instance = outer06.getInner06Instance();
        inner06Instance.say();
    }
}
class Outer06 { //外部类
    private int n1 = 200;
    public String name = "张化";
private void  hi(){
    System.out.println("hi()方法");
}
    //1.成员内部类，是定义在外部类的成员位置上
    //2.
  class Inner06 { //成员内部类  ,可以使用任何修饰符比如private等
    private double sal=99.9;
    private int n1=55;
        public void say() {
            //可以直接访问外部类的所有成员，包含私有的
            //如果成员内部类和外部好累的成员重名时，默认就近原则
            //否则可以通过     外部类名.this.属性   来访问外部类的成员
            System.out.println("n1=" + n1 + "name=" + name+"外部类的n1="+n1+ "外部类="+Outer06.this.n1);
            hi();
        }
    }
    //方法返回一个对象
    public Inner06 getInner06Instance(){
    return new Inner06();
    }
    //写方法
    public void t1(){
        //使用成员内部类
        //调用创建成员内部类对象，然后使用相关方法
        Inner06 inner06 = new Inner06();
        inner06.say();

    }

}
