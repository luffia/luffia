package com.zixue.Map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Map01 {
    public static void main(String[] args) {
        Map map = new HashMap();
//        Map中的K可以为null，   Value也可以为null，
//        当Key为null时，只能有一个
        //当Value为null，可以有多个
        map.put("no1","小花");
        map.put("no2","小花e");
        map.put("no3","小花");
        map.put(null,null);
        map.put(null,"abc");
        map.put(10,"abc");
        System.out.println(map.get("no3"));//得到no3对应的Value元素
        //返回的是Value数据  小花
    }
}
