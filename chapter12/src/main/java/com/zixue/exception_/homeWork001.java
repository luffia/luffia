package com.zixue.exception_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork001 {
    public static void main(String[] args) {
        try {
            if (args.length !=2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            //先把接收到的参数转成整数
            int n1=Integer.parseInt(args[0]);
            int n2=Integer.parseInt(args[1]);
            double res=cal(n1,n2);//该方法可能抛出ArithmeticException
            System.out.println("计算结果是="+res);

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("参数格式不正确");
        }catch (ArithmeticException e){
            System.out.println("不能为0");
        }
    }
    public static double cal(int n1 , int n2){
        return n1 / n2;
    }
}
//编写应用程序EcmDef.java接收命令行的两个参数（整数），计算两数相除
//    计算两数相除要求使用方法cal（int n1 int n2 ）
//    对数据格式不正确（NumberFormatException），缺少命令行参数ArrayIndexOutOfBoundsException
//    除0进行异常处理ArithmeticException
