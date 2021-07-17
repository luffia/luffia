package com.zixue.exception_;

import java.util.Scanner;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class TryCatch01 {
    public static void main(String[] args) {
        //  解析：创建Scanner
//2、使用无限循环，去接受一个输入
//3、然后将该输入的值转换成一个int
//4、如果在转换时抛出异常，说明输入的内容不是一个可以转成int的内容
//如果没有抛出异常则break该循环
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while (true) {
            System.out.println("输入整数：");
            inputStr = scanner.next();
            try {
                num = Integer.parseInt(inputStr);//这可能会抛出异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是整数");
            }
        }
        System.out.println("输入的值是=" + num);

    }
}

