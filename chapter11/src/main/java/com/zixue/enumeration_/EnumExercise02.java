package com.zixue.enumeration_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class EnumExercise02 {
    public static void main(String[] args) {
//1、获取所有对象，返回数组
        Week[] weeks=Week.values();
        //遍历数组
        System.out.println("=====所有星期信息如下====");
        for (Week week:weeks){
            System.out.println(week);
        }
    }
}
//声明week枚举类，其中包含星期一到星期日；
//MONDAY，TUESDAY，WENDESDAY、THURSDAY、FRIDAY、SATURDAY、SUNDAY
//使用values返回所有的枚举数组并遍历，
enum Week{
    //定义Week的枚举对象
    MONDAY("星期一"),TUESDAY("星期二"),WENDESDAY("星期三");
    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }
}