package com.zixue.exception_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;

//        使用异常处理机制来解决try-catch
//        1、选中代码块=》快捷键
        //2、如果进行异常处理，那么即使出现异常，程序也可以继续执行
        try{
            int res=num1/num2;
        }catch (Exception e){
            System.out.println("出现异常的原因="+e.getLocalizedMessage());
        }
        int res=num1/num2;  //异常
        System.out.println("退出");
    }
}
