package com.zixue.Thread_.Method_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        Thread r = new Thread(new R());
        for (int i = 0; i <= 10; i++) {
            System.out.println("hello........." + i);
            if (i == 5) {//如果主线程输出了5次
                r.start();//启动 子线程 输出 加油
                r.join();//立即将 r 子线程插入到main主线程
                         // 让 r 先执行
            }
            //输出一次 hello 也让主线程休眠 1 秒
            Thread.sleep(1000);
        }
    }
}
//主线程每隔1s ,输出 hello ，一共10次
//当输出到 hello 5的时候，启动一个子线程（要求实现Runnable），每隔 1 s 输出加油
//该线程输出10次加油后，退出
//主线程继续输出hello直到主线程退出
class R implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("加油。。。。。。" + (++count));
            if (count == 10) {
                break;
            }
        }
    }
}