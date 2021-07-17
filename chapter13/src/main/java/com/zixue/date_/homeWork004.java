package com.zixue.date_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork004 {
    public static void main(String[] args) {
        //遍历字符串，如果 char 在0～9就是一个数字
        //如果char在 'a'--'z'之间就是一个小写字母
        ///如果char在 'A'--'z'之间就是一个大写字母
        String str = "ahbdhuigdhdbfu O(O 23122";  //定义一个字符串数组
        countStr(str);
    }

    public static void countStr(String str) {  //先写个方法
        if (str == null) {
            System.out.println("输入的不能为空");
        }
        int strLen = str.length();
        int numCount = 0;
        int LowerCount = 0;
        int UpperCount = 0;
        int OtherCount = 0;
        for (int i = 0; i < strLen; i++) {
            if (str.charAt(i) > '0' && str.charAt(i) <= '9') {
                numCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                LowerCount++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                UpperCount++;
            } else {
                OtherCount++;
            }
        }
        System.out.println("数字有=" + numCount);
        System.out.println("小写有=" + LowerCount);
        System.out.println("大写有=" + UpperCount);
        System.out.println("其他有=" + OtherCount);
    }
}
