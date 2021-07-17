package com.zixue.date_;

import java.util.Scanner;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homework001 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner();
        String name = "小明";
        String pwd = "122345";
        String email = "jack@souhu.com";
        try {
            userRegister(name, pwd, email);
            System.out.println("恭喜注册成功");
        } catch (Exception e) {
            System.out.println("输入不正确");
        }
    }
    public static void userRegister(String name, String pwd, String email) {
        if (!(name != null && pwd != null && email != null)) {
            throw new RuntimeException("参数不能为空");
        }
        //用户名长度为2或3或4
        int userLength = name.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("输入正确的名字，格式为2-4个字符");//直接抛出一个异常
        }

//        2、密码长度为6，要求全是数字 isDigital
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码长度为6，要求全是数字");
        }
//        3、邮箱中包含@和.  并在@在.的前面
        int i = email.indexOf('@');//  第一步接收一下这两个字符
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱中包含@和.  并在@在.的前面");
        }
    }
    public static boolean isDigital(String str) {//unicode码对应 的数字进行判断是不是数字
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}


//      输入用户名、密码、邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
//       要求：1、用户名长度为2或3或4
//                2、密码长度为6，要求全是数字 isDigital
//                 3、邮箱中包含@和.  并在@在.的前面