package com.zixue.exception_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class CustomException_ {
    public static void main(String[] args) {
        int Age=180;   //输出：。。。。。（省略错误提示）需要输入正确的年龄
        if (!(Age>=18 && Age<=120)){
            throw new AgeException("需要输入正确的年龄");
        }else {
            System.out.println("输入的年龄是="+Age);
        }
    }
}
//接收一个Person对象年龄时，要求范围在18-120之间，否则抛出一个自定义异常
//要求（继承RuntimeException）并给出提示信息
//自定义一个异常
class AgeException extends RuntimeException{
    public AgeException(String message) {//构造器
        super(message);
    }
}