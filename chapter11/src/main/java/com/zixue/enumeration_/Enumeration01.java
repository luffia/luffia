package com.zixue.enumeration_;
/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Enumeration01 {
    //使用：
    public static void main(String[] args) {
        new Season("夏天","温暖");
        new Season("春天","漂亮");
        new Season("秋天","凉爽");
        //。。。。。y因为对于季节而言，他具体的值是固定的不会有更多的
        //按这样设计类的思路不能体现季节是有限固定的四个值，所以
        //希望Season就是4个对象所以要用枚举（枚：一个一个的   举：列举出来）
        // 即把具体的对象一个一个的列举出来
    }
}
class Season{
    private String name;
    private String desc;//描述

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}