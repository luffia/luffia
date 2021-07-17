package com.zixue.enumeration_.Homework;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork03 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        //解读：匿名内部类是 cellPhone.testWork(new ICalculate() {
        //            @Override
        //            public double work(double n1, double n2) {
        //                return n1*n2;
        //            }
        //        },100,30);同时也是一个对象
        //她的编译类型是 ICalculate    运行类型是匿名内部类


        cellPhone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1*n2;
            }
        },100,30); //匿名内部类可以作为参数直接传进去

        cellPhone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },10,30);
    }
}
//     计算接口具有work方法，功能室运算，有一个手机类Cellphone，定义方法testWork测试计算功能，
//      调用计算接口的work方法
//     要求调用CellPhone对象的testWork方法使用到匿名类
//编写接口
interface ICalculate{
    //work方法是完成计算，但是没有具体要求所以自己设计
    //至于该方法怎么计算，交给匿名内部类来解决
    public double work(double n1,double n2);
}
//手机类Cellphone
class CellPhone{
    //当我们调入testWork方法时，直接传入类ICalculate接口的匿名内部类即可
    //该匿名内部类，可以灵活的实现work，完成不同的计算任务
    public void testWork(ICalculate  iCalculate,double n1 , double n2){  //传入一个接口，然后把n1，n2穿进去
        double result=iCalculate.work(n1, n2);   //动态绑定机制
        System.out.println("计算后的结果是="+result);
    }
}