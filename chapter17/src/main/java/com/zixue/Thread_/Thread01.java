package com.zixue.Thread_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
//编写程序开启线程，该线程每隔一秒，在控制台输出“喵喵喵，我是小猫咪：
//对上面改进，当输出80次“喵喵喵，我是小猫咪：的时候，结束该线程
//使用JConsole监控线程执行情况，并画出线程示意图
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
//        5、创建一个小猫
        Cat cat = new Cat();

//        老韩读源码分析start
        /**源码：
         * (1)
         * public synchronized void start() {
         * 调用 start0();
         }
         (2)
         start0()是本地方法，是JVM机调用，底层是c/c++实现
         真是实现多线程的是 start0（）方法，而不是run
         private native void start0();
         */

//        6、开始启动猫程序
        cat.start();//启动线程--》最终会执行 Cat 的 run 方法
//        cat.run();//如果这样写， run 方法只是一个普通的方法，并没有真正的启动一个线程就会把 run 方法执行完毕 才继续向下执行
        //会造成阻塞，所以要写start方法
//        测试主线程写的程序
        System.out.println("主线程继续执行" + Thread.currentThread().getName());//输出主线程的名称
        for (int i = 0; i < 80; i++) {
            System.out.println("主线程I=" + i);
//            让主线程休眠
            Thread.sleep(1000);//将异常抛出到主方法
        }

//        说明，当 main  线程启动一个 子线程 Thread-0 ，主线程不会阻塞，会继续执行
//           这时的 主线程 跟 子线程 是 交替执行 的

    }
}

//1、写一个猫，继承Tread
class Cat extends Thread {
    //    8、记录输出的次数定义一个times
    int times = 0;

    //    2、重写run方法
    @Override
    public void run() {
        super.run();

//        7、使用while循环遍历打印输出   喵喵喵，我是小猫咪
        while (true) {

            //4、使用try-catch将第 3 步包起来

            try {
                //3、线程开始是两秒后，且每次执行间隔都是两秒
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("喵喵喵，我是小猫咪：" + ++times);

            // 8 、当循环到80 次 时候自动退出
            if (times == 80) {
                break;//80 次后整个线程也就退出了
            }
        }
    }
}