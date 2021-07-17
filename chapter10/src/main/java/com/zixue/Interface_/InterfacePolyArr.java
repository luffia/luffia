package com.zixue.Interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        //多态数组--》接口类型数组
        USB[] usbs = new USB[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();
        for (int i = 0; i <= usbs.length; i++) {
            usbs[i].work();//动态绑定
            //和前面一样，我们仍然要进行类型的向下转型
            if (usbs[i] instanceof Phone_) {
                ((Phone_) usbs[i]).call();
            }
        }
    }
}

interface USB {
    void work();
}

class Phone_ implements USB {
    public void call() {
        System.out.println("手机可以打电话。。。");
    }

    @Override
    public void work() {
        System.out.println("手机工作。。。。");
    }
}

class Camera_ implements USB {
    @Override
    public void work() {
        System.out.println("相机工作中。。。。。。");
    }
}