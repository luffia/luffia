package com.zixue.annotation_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Deprecated_ {
    public static void main(String[] args) {
        AA aa = new AA();
    }
}
//过时了并不代表不能用
//可以做版本升级用
@Deprecated
class AA{
    public void Cat(){
        System.out.println("猫猫很可爱");
    }
}