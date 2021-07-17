package com.zixue.List_;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class List01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
      ArrayList list = new ArrayList();
      list.add("jack");
      list.add("smith");
      list.add("dog");

      //List集合类中元素有序（即添加顺序和取出顺序一致）且可重复
        System.out.println(list);  //[jack, smith, dog]

        //List集合中的每个元素都有其对应的顺序索引，即支持索引
        //索引是从0开始的
        System.out.println(list.get(2));  //dog

        //
    }
}
