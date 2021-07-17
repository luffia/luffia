package com.zixue.Innerclass_;

public class AnonymousInnerClassExercise012 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        //传入的是实现了Bell接口的匿名内部类
        //重写类ring  bell的编译类型是Bell运行类型是重写的匿名内部类
        cellphone.alarmClock(new Bell() {  //创建匿名内部类
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellphone.alarmClock(new Bell() {   //再传入一次
            @Override
            public void ring() {
                System.out.println("小伙伴们上课了");
            }
        });

    }
}
//      有一个铃声接口Bell，里面有个ring方法
//      2、有一个手机类Cellphone，具有闹钟功能alarm clock，参数是Bell类型
//      3、测试手机类的闹钟功能，通过匿名内部类（对象）作为参数，打印：懒猪起床了
//       4、在传入另一个匿名内部类（对象），打印：小伙伴上课了
interface Bell{  //接口
    void ring();  //方法
}
class Cellphone{  //类
    public void alarmClock(Bell bell){  //行参是接口类型
        bell.ring();
    }
}