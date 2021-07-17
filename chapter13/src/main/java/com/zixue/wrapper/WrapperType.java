package com.zixue.wrapper;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class WrapperType {
    public static void main(String[] args) {
        //JDK5前的手动装箱和拆箱方式
//        手动装箱
//        int-----》Integer
        int  n1=100;
    //    Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
//        Integer -----》 int
//        int i = Integer.intValue();

//        JDK5以后（包括JDK5）的自动装箱和拆箱
        //自动装箱 int-----》Integer
        int n2=300;
        Integer integer2=n2;

        //自动拆箱
//        Integer -----》 int
        int n3=integer2;  //底层依然使用的是Integer.valueOf（）
    }
}
