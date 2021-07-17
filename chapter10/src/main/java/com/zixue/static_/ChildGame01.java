package com.zixue.static_;

public class ChildGame01 {
    public static void main(String[] args) {
        //传统方法

        //定义一个变量  count 用来记录有多少个小孩加入

      //  int count =0;
        Child child1 = new Child("白");
        child1.join(); //第一个小孩。加入
      //  count++;      //人数累积增加
        child1.count++;

        Child child2 = new Child("黄");
        child2.join();   //第二个加入
       // count++;         //又增加一个，人数继续增加
        child2.count++;

        Child child3 = new Child("绿");
        child3.join();
       // count++;
        child3.count++;
        System.out.println("一共有"+Child.count+"个小孩加入游戏");//这里用
                            // child3.count\ child2.count\child1.count都是一样的效果因为count是一个共享的类

        //下面输出什么  都是3
        System.out.println("child1.count="+child1.count);  //3
        System.out.println("child2.count="+child2.count);   //3
        System.out.println("child3.count="+child3.count);    //3

    }

}
class Child{
    //改进，定义一个变量count，是一个类变量（静态变量）用static
    //该变量的最大特点是会被Child类所有的对象访问；
    public static int count=0;
    private String name;

    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name+" 加入游戏 ");
    }
}