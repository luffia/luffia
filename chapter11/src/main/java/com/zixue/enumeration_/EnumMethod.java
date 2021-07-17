package com.zixue.enumeration_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用season2为举例
        Season2 autumn=Season2.AUTUMN;
        //输出枚举对象名称name
        System.out.println(autumn.name());
        //ordinal()：返回当前对象的位置号，默认从0开始
        System.out.println(autumn.ordinal()); //输出2
        //从反编译可以看到有values返回season2【】
        Season2[] values = Season2.values();
        System.out.println("=====遍历取出枚举对象（增强for循环）=====");
        for (Season2 season:values){//增强for循环
            System.out.println(season);//返回season
        }

        //value Of：将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常
        Season2 autumn1=Season2.valueOf("AUTUMN");
        System.out.println("autumn1="+autumn1);
        System.out.println(autumn1==autumn);//true

        //6、compare To：比较两个枚举常量，比较的就是编号
        /*
        *  if (self.getClass() != other.getClass() && // optimization

        return self.ordinal - other.ordinal;*/
        System.out.println(Season2.SPRING.compareTo(Season2.WINTER) );  //Season2.SPRING-Season2.WINTER的结果
                                                                  //0-3=-3  输出-3


//        //举例for 循环
//        int[]nums ={1,3,4,6};
//        //普通for循环
//        System.out.println("=====普通for循环=====");
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//        System.out.println("=====增强for循环====");
//        for (int i:nums){   //执行流程依次从nums数组中取出元素赋给i；如果取出完毕，则退出for
//            System.out.println("i="+i);
//        }
    }
}
