package com.zixue.String_;

import java.util.Arrays;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class String02 {
    public static void main(String[] args) {

        Integer []arr={1,2,50,333,555};
        //binarySearch通过二分搜索法进行查找，要求必须排好序
        //如果数组中不存在该元素，就返回return-（low+1）；
        //比如key=55是在50和333中间的数下标应该在3的位置所以返回return-（low+1）=return-4
        int index= Arrays.binarySearch(arr,55);
        System.out.println("index="+index);  //index=-4
        Integer []num=new Integer[]{9,5,2};
        //使用99去填充num数组，可以理解成是替换原来的元素
        Arrays.fill(num,99);
        System.out.println("填充后的");
        System.out.println(Arrays.toString(num));//返回【99，99，99】
        //
        //equals比较两个数组元素内容是否完全一致
        Integer []arr2={1,20,50,333,555};
        boolean equals=Arrays.equals(arr,arr2);
        System.out.println(equals);//false


    }
}
