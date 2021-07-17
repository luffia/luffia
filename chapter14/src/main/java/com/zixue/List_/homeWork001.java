package com.zixue.List_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
@SuppressWarnings({"all"})
public class homeWork001 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("韩寒");
        list.add("先行");
        list.add("贾宝玉");
        System.out.println(list);  //[韩寒, 先行, 贾宝玉]
        //
        //1、在index=1的位置插入一个对象
        list.add(1, "薛宝钗");
        System.out.println(list);  //[韩寒, 薛宝钗, 先行, 贾宝玉]

        //2、boolean addAll(int index,collection else):从index位置开始将else中所有元素添加进来
        ArrayList list1 = new ArrayList();
        list1.add("jack");
        list1.add("lucy");
        list.addAll(1, list1);
        System.out.println(list);   //[韩寒, jack, lucy, 薛宝钗, 先行, 贾宝玉]

//        int indexOf(Object obj):返回obj在当前集合中末次出现的位置
        list.add("小猫咪喵喵喵");
        System.out.println(list); //[韩寒, jack, lucy, 薛宝钗, 先行, 贾宝玉, 小猫咪喵喵喵]
        System.out.println(list.lastIndexOf("小猫咪喵喵喵"));  //6

//        Object remove (int index):移除指定index位置的元素，并返回此元素
        list.remove(0);
        System.out.println(list); //[jack, lucy, 薛宝钗, 先行, 贾宝玉, 小猫咪喵喵喵]

//        Object set(index,Object ele):设置指定位置index位置的元素ele，相当于替换
        list.set(3, "小猪哼哼");
        System.out.println(list);//[jack, lucy, 薛宝钗, 小猪哼哼, 贾宝玉, 小猫咪喵喵喵]小猪哼哼替换了先行

//        list subList(int formIndex,int toIndex):返回从fromIndex到toIndex位置的子集合。意思是前闭后开
//             注意：返回的子集合 formIndex <=subList<toIndex
        List returnlist = list.subList(0, 3);//返回的包含0，1，2 包含3
        System.out.println(returnlist);
    }
}
