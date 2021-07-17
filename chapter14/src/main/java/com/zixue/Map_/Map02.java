package com.zixue.Map_;

import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Map02 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("鹿晗", "关晓彤");
        map.put("关以", "哈哈");
        map.put(null, "刘一飞");
        map.put("松松", null);
        map.put("宝宝","马蓉");

        //第一种：先取出所有的Key，通过K取得对应的value
        Set keyset = map.keySet();
//        (1)增强for循环
        for (Object key :keyset) {
            System.out.println(key+"--"+map.get(key));
        }
//        (2)使用迭代器\
        System.out.println("============================");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key+"--"+map.get(key));
        }


    }
    }

