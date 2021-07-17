package com.zixue.Collections_;

import java.util.*;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork0003 {
    public static void main(String[] args) {
        //使用Hash Map实例化Map类型的对象m，键String和值int分别储存
        //员工姓名和工资，数据如下
        //jack--650元；tom--1200元；smith--2900元
        //将jack的工资更改为2600元
        //为所有员工工资加薪100元
        //遍历集合中所有员工
        //遍历集合中所有工资
        Map m = new HashMap();
        m.put("jack", 650);
        m.put("tom", 1200);
        m.put("smith", 2900);
        System.out.println(m);

//        将jack的工资更改为2600元
        m.put("jack", 2600);
        System.out.println(m);

        //为所有员工工资加薪100元
//        keySet r然后增强for循环
        Set keySet = m.keySet();
        for (Object key : keySet) {
            //更新
            m.put(key, (Integer) m.get(key) + 100);
        }
        System.out.println(m);
//        输出结果如下
//        {tom=1200, smith=2900, jack=650}
//        {tom=1200, smith=2900, jack=2600}
//        {tom=1300, smith=3000, jack=2700}
//
//        遍历s所有entrySet
        System.out.println("====================================");
        Set set = m.entrySet();
        //d迭代器
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
        //遍历集合中所有员工 工资
        System.out.println("=============================");
        Collection values = m.values();
        for (Object o : values) {
            System.out.println(o);//1300/3000/2700
        }
    }
}
