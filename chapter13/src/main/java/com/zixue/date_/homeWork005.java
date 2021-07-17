package com.zixue.date_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork005 {
    //          将字符串中指定部分进行反转。比如将“abcdef”反转为“aedcbf”
    //          编写方法public static String reverse（String str，int start，int end）
    public static void main(String[] args) {
        //最后一步：测试
        String str="abcdef";
        System.out.println("==交换前==");
        System.out.println(str);
      str= reverse(str, 1, 4);
        System.out.println("==交换后==");
        System.out.println(str);
    }
    //    第一步：编写方法
    public static String reverse(String str, int start, int end) {
        //第二步：字符串本身是final类型的不能直接修改，所以要先把String转换成char【】，
        //因为char【】数组里的元素是可以交换的
        char[] chars = str.toCharArray();
        char temp = ' ';//交换辅助变量
        for (int i = start, j = end; i < j;i++,j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        //使用chars重新构建一个String。返回即可。
     return new String(chars);
    }
}
