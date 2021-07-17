package com.zixue.annotation_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Override_ {
    public static void main(String[] args) {

    }
}

class Father {
    public void fly() {
        System.out.println("Father  fly....");
    }
}

class Son extends Father {//子类

    //   解读
    //   1、@Override是注解放在fly方法上，表示子类的fly方法时重写了父类的fly
    //2、如果没有写，仍然会重写父类的fly
    //3、如果写了注解，编译器就会检查该方法是否真的重写了某个方法，如果的确构成重写了，则编译通过
    //     反之，则编译错误
    @Override
    public void fly() {
        System.out.println("son fly");
    }
}