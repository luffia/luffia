package com.zixue.Map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class TreeMap001 {
    public static void main(String[] args) {
        //使用默认构造器是无序的。
      //  Tr
        //要求按照传入的String的大小进行排序
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
           //  1、   return ((String)o1).compareTo((String)o2);//要求按照传入的String的大小进行排序
                                                  //{Kristemr=克里斯娜符, jack=捷克, smith=捷克哈, tom=汤姆}
                return ((String)o1).length()-((String)o2).length();//要求按照传入的String的长度进行排序
                         //                 {tom=汤姆, jack=捷克, smith=捷克哈, Kristemr=克里斯娜符}

            }
        });
        map.put("jack","捷克");
        map.put("tom" ,"汤姆");
        map.put("Kristemr","克里斯娜符");
        map.put("smith","捷克哈");
        map.put("tom" ,"汤姆");////按照字符长度加入的话加入不了
        System.out.println(map);
    }
}
