package com.zixue.wrapper;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类-Integer----》String
        Integer i=100;//自动装箱
        //方式1
        String str1=i+"";
        //方式2
        String str2=i.toString();
        //方式3
        String str3=String.valueOf(i);


        //String----->包装类
        String str4="12345";
        Integer i2=Integer.parseInt(str4);
        Integer i3=new Integer(str4 );

        System.out.println("好的");

    }
}
