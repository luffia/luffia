package com.zixue.exception_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Exception02 {
    public static void main(String[] args) {
        try {
            String str = "和";
            int a = Integer.parseInt(str);
            System.out.println("数字+" + a);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("异常信息="+e.getLocalizedMessage());
        }finally {
            System.out.println("finally被执行");
        }

        System.out.println("程序继续");
    }
}
