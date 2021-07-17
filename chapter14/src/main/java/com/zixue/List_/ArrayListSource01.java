package com.zixue.List_;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class ArrayListSource01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 0; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(300);
        list.add(null);
        for (Object o :list) {
            System.out.println(o);
        }

    }
}
