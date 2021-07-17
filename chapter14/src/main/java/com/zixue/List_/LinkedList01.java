package com.zixue.List_;

import java.util.LinkedList;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        linkedList.remove();//默认删除第一个节点
        System.out.println(linkedList);
//
//          修改
        linkedList.set(1, 888);//修改，下标为1的修改为888
        System.out.println(linkedList);

    }
}
