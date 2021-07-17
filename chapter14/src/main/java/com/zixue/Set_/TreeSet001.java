package com.zixue.Set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class TreeSet001 {
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
//              return((String)o1).compareTo((String)o2);//按照字母表的顺序排序[huhu, ku, tuh, w, we]
             return((String)o1).length()-((String)o2).length();//按照字符串的长度的顺序排序[w, ku, tuh, huhu]

            }
        });
        treeSet.add("huhu");
        treeSet.add("tuh");
        treeSet.add("ku");
        treeSet.add("w");
        treeSet.add("we");

        System.out.println(treeSet);
    }
}
