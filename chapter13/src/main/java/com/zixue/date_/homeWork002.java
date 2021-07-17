package com.zixue.date_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork002 {
    public static void main(String[] args) {
        //编写程序，输入形式为：Han Shun Ping的人名，以Ping，Han，S的形式打印出来其中.S是中间单词的首字母
        //   例如输入“Willian Jeffweson Clinton”输出形式为：Clinton，Willian.J

        //分析：1、对输入的字符串进行分割Split
//        2、对得到的String【】进行格式化String.format()
//        3\对得到的数据进行校验
        String name="Han Shun Ping";
        printName(name);

    }
    public static void printName(String str){
        if (str==null){
        System.out.println("Str 不能为空");
        return;
        }
        String [] names= str.split(" ");
        if (names.length!=3){
            System.out.println("你输入的字符串格式不对");
            return;
        }
//        输入的内容要有个接收的所以用String format接收
        String format = String.format("%s,%s .%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }//最后输出Ping,Han .S
}
