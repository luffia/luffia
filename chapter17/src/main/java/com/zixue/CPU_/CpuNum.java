package com.zixue.CPU_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime =Runtime.getRuntime();
//        获取当前电脑的核
        int cpuNums = runtime.availableProcessors();
        System.out.println("当前有"+cpuNums);

    }
}
