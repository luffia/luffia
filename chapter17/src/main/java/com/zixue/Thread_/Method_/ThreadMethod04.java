package com.zixue.Thread_.Method_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class ThreadMethod04 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
//        如果我们希望当 main 主线程结束后，子线程自动结束
        //只需要将子线程设置为 守护线程 即可
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        int count=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("小胡胡在好好学习，加油中。。。。。"+(++count));
            Thread.sleep(900);
        }
    }
}
class MyDaemonThread extends Thread{
    private  int count=0;
    @Override
    public void run() {
        super.run();
        for (; ;){
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("张华在大声的聊天，哈哈哈哈。。。。。。。。"+(++count));
        }
    }
}