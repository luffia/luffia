package com.zixue.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class CollectionFor01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国", "罗", 55));
        col.add(new Book("红楼", "曹学琴", 90));
        col.add(new Book("小飞到", "闪闪", 66));

        //使用增强for循环，在 Collection集合上
        //2、增强for底层代码仍然是迭代器
        //可以理解成简化版的迭代器遍历
        for (Object book:col){
            System.out.println(book);
        }
        System.out.println("=======使用快捷键遍历效果============");
        for (Object o :col) {
            System.out.println(o);
        }

        //增强for也可以直接在数组使用
        int[] nums={20,1,33,22,111};
        for (int i : nums){//元素类型  元素名：集合名或数组名
            System.out.println(i);
        }
    }
}
