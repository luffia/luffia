package com.zixue.Set_;
import java.util.Set;
import java.util.HashSet;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        //先返回布尔类型值，true or false
        System.out.println(set.add("jone"));
        System.out.println(set.add("mary"));
        System.out.println(set.add("jone"));
        System.out.println(set.add("dog"));
        System.out.println(set.add(null));
        System.out.println(set);  //输出结果是如下
        /**
         * true
         * true
         * false
         * true
         * true
         * [null, mary, jone, dog]
         * */
        System.out.println("=======================");
     set= new HashSet();
//        System.out.println(set);
        set.add("jiu");//添加成功
        set.add("han");//添加不了
        set.add(new Dog("tom"));//可以加入进去
        set.add(new Dog("tom"));

        set.add(new String("haha"));
        set.add(new String("haha"));
        System.out.println(set);

    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }
}
