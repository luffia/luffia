package com.zixue.PrintStream_;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 *
 * 演示字节打印流  PrintStream01
 */
public class PrintStream01 {
    public static void main(String[] args) throws IOException {

//        默认情况的输出是标准输出，位置是 显示器
        PrintStream out = System.out;
        out.print("张小花，吃粑粑");
//          print  的源码
//        public void print (String s){
//        if (s==null;)
//              s="null"
//        }
//        write(s)     //底层是 write，所有直接调用write 也是可以的
//    }
        out.write("小白猫，喵喵喵".getBytes()); //因为 PrintStream 是字节流，所以只能写字节 byte


//       1、 我们也可以修改 打印流的 位置
//      2、 将 "蹦蹦跳跳的小兔子" 放在" /Users/huyu/Desktop/33.txt")
//        3、上面的不受影响
        System.setOut(new PrintStream("/Users/huyu/Desktop/33.txt"));
        System.out.println("蹦蹦跳跳的小兔子");
        out.close();
    }
}
//最后输出效果
//控制台输出：张小花，吃粑粑小白猫，喵喵喵
// 3.txt输出 "蹦蹦跳跳的小兔子