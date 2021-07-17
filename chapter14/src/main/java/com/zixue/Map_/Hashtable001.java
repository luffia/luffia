package com.zixue.Map_;

import java.util.Hashtable;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Hashtable001 {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("lili",100);
        hashtable.put("li",00);
        hashtable.put("lucy",700);
        hashtable.put("lili",500);
        System.out.println(hashtable);



        //Hashtable的底层
       /*1、底层数组Hashtable$Entry【】初始化大小为11
       * 2、临界值 threshold 8=11*0。75
       * 3、扩容：按照自己的扩容机制来进行即可
       * 4、执行方法addEntry(hash key,value,index);添加K-V封装到Entry
       * 5、当if（count》=threshold满足时就进行扩容
       * 6、按照int newCapacity=(oldCapacity<<1)+1;的大小扩容
       *
       *
       * */
    }

}
