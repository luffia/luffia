package com.zixue.standard_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class InputAndOutput01 {
    public static void main(String[] args) {

//      System  类的  public static final InputStream in = null;
//      System.in    编译类型是     InputStream
//      System.in    运行类型是     BufferedInputStream
//        表示标准输入  键盘
        System.out.println( System.in.getClass());

//         System  类的  public static final PrintStream out = null;
//        编译类型   PrintStream
//        运行类型    PrintStream
//        表示 标准输出， 显示器中
        System.out.println( System.out.getClass());
    }
}
