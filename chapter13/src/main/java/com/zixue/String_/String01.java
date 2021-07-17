package com.zixue.String_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class String01 {
    public static void main(String[] args) {
    //创建一个大小为16 的char【】，用于存放字符内容
         StringBuffer stringBuffer = new StringBuffer();

//     通过构造器指定char【】的数组大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

//       通过给一个String  创建StringBuffer
        StringBuffer stringBuffer2= new StringBuffer("hello");

        //String------》StringBuffer
        String str ="hello  tom";
        //方式一：使用构造器
        //返回的才是StringBuffer对象 ，对str本身没有影响
        StringBuffer stringBuffer3 = new StringBuffer(str);
//
        //方式二：使用的是append方法
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4 = stringBuffer4.append(str);

//        StringBuffer-----》String
        StringBuffer stringBuffer5 = new StringBuffer("小花笑哈哈");

        //方式一：使用StringBuffer提供的toString方法
        String s = stringBuffer5.toString();

        //方式二：使用构造器
        String s1 = new String(stringBuffer5);


    }
}
