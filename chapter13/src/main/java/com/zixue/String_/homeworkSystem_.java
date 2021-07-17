package com.zixue.String_;

import java.util.Arrays;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeworkSystem_ {
    public static void main(String[] args) {
        //源数组
        int[] src = {1, 2, 3};
        int[] dest = new int[3]; //dest当前是{0,0,0}
             //源数组
        /* * @param      src      the source array.
             //从源数组的哪个索引位置开始拷贝
           * @param      srcPos   starting position in the source array.
            //目标数组，即把源数组的数据拷贝到哪个数组
           * @param      dest     the destination array.
           //把源数组的数据  拷贝到 目标数组的哪个索引
           * @param      destPos  starting position in the destination data.
             从源数组拷贝多少个数据到目标数组
           * @param      length   the number of array elements to be copied.
         */
        System.arraycopy(src,0,dest,0,2);
        System.out.println(Arrays.toString(dest));

    }
}
