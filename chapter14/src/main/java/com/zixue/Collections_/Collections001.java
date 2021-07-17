package com.zixue.Collections_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Collections001 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("smith");
        list.add("king");
        list.add("milan");
        list.add("tomsith");
        System.out.println(list );//[smith, king, milan, tomsith]
        System.out.println("====================================");

        //reverse(list):反转List中元素的顺序
        Collections.reverse(list);
        System.out.println(list);//[tomsith, milan, king, smith]

        //
    }
}
