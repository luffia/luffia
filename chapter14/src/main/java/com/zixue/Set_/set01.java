package com.zixue.Set_;

//import java.util.HashSet;
//import java.util.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
@SuppressWarnings({"all"})
public class set01 {
    public static void main(String[] args) {
//        HashSet set = new HashSet();

        Set set = new HashSet();
        //1、添加的顺序跟取出的顺序不一样
        //2、不能存放重复的元素
        //3、空null可以添加，但只能添加一次
        //4、Set接口可以实现HashSet
        set.add("jason");
        set.add("lucy");
        set.add(null);
        set.add("lucy");
        set.add(null);
        set.add("han");
        System.out.println(set);
    }
}
