package com.zixue.enumeration_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Enumeration03 {
    public static void main(String[] args) {
        //演示枚举关键字
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.WINTER);
    }
}
enum Season2 {//  第一步使用枚举enum替代class

//    public static final Season2 SPRING = new Season2("春天", "温暖");
//    public static final Season2 SUMMER = new Season2("夏天", "炎热");
//    public static final Season2 AUTUMN = new Season2("秋天", "漂亮");
//    public static final Season2 WINTER = new Season2("冬天", "下雪");

    //使用关键字enum关键字实现枚举
    //1、使用关键字enum  替代  class
    //2、 public static final Season2 SUMMER= new Season1("夏天", "炎热")直接使用下面替代
       //SUMMER（"夏天"，"炎热"）解读  常量名（实参列表）
    //3、有多个常量（对象）时，使用逗号，隔开即可
    //4、如果使用enum来实现枚举，要求将定义常量对象，写在最前面
//    5、如果使用的是无参构造器创建对象则可以省略小括号
    SPRING("春天","温暖"),SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "漂亮"),WINTER("冬天", "下雪");

    private String name;
    private String desc;//描述

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}