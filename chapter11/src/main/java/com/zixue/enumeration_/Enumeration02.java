package com.zixue.enumeration_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Enumeration02 {
    public static void main(String[] args) {
        //定义了四个固定的属性
        System.out.println(Season1.AUTUMN);
        System.out.println(Season1.SPRING);
        System.out.println(Season1.SUMMER);
        System.out.println(Season1.WINTER);
    }
}
//1、将构造器私有化
//2、将SetXXX的方法去掉，防止被修改
//3、在season1内部，直接创建固定对象
//4、优化加入final

    class Season1 {
        private String name;
        private String desc;//描述

        //在season1内部，直接创建固定对象
        public static final Season1 SPRING=new Season1("春天","温暖");
        public static final Season1 SUMMER=new Season1("夏天","炎热");
        public static final Season1 AUTUMN=new Season1("秋天","漂亮");
        public static final Season1 WINTER=new Season1("冬天","下雪");

      private Season1(String name, String desc) {
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
            return "Season1{" +
                    "name='" + name + '\'' +
                    ", desc='" + desc + '\'' +
                    '}';
        }
    }