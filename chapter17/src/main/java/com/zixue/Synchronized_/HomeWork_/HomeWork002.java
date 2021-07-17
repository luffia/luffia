package com.zixue.Synchronized_.HomeWork_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class HomeWork002 {
    public static void main(String[] args) {
        T t = new T();
        Thread thread1 = new Thread(t);
        thread1.setName("张小花");
        Thread thread2 = new Thread(t);
        thread2.setName("胡小鱼");
        thread1.start();
        thread2.start();
    }
}
//有两个用户风别从一张卡上取钱，（总额10000
//每次都取1000元，当余额不足时就不能取款，不能出现超取现象

//
class T implements Runnable {
    private int money = 10000;

    @Override
    public void run() {

        while (true) {

            synchronized (this) {
//               1、这里使用synchronized 实现线程同步
//               2、当多个线程执行到这里时，就会去争夺 this 对象锁
//               3、那个线程争取到（获取到） this 对象锁，就执行synchronized 代码块
//                      执行完后，会释放 this 对象锁
//                4、争夺不到对象锁的就阻塞在那争取下次再争夺
                //判断余额是够
                if (money < 1000) {
                    System.out.println("余额不足，不能取了。。。。。");
                    break;
                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName() + "取出了1000元   当前余额" + money);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}