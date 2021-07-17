package com.zixue.collection;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Collection_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

//        add  添加单个元素
        list.add("jack");
        list.add(10);//list.add(new Integer(10))
        list.add(true);
        System.out.println(list);   //返回 [jack, 10, true]

//        remove删除指定元素
        list.remove(0);//删除第一个元素
        list.remove("jack");//或者这样写，指定删除某个对象
        System.out.println(list);  //返回[10, true]

        //contains：查找元素是否存在
        System.out.println( list.contains("jack")); //false

        //size获取元素的个数
        System.out.println(list.size()); //2

        //isEmpty:判断是否为空
        System.out.println(list.isEmpty());  //false

        //clear清空
        list.clear();
        System.out.println(list); //返回【 】空数组

        //addAll添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list2.add("武林外传");
        list.addAll(list2);
        System.out.println(list);//输出：[红楼梦, 三国演义, 武林外传]

        //containsAll查找多个元素是否存在
        System.out.println(list.containsAll(list2)); // true

        //removeAll删除多个元素
        list.add("聊斋志异");
        list.removeAll(list2);
        System.out.println(list);  //输出 [聊斋志异]



    }
}
