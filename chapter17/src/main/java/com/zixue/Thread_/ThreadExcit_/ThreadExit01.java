package com.zixue.Thread_.ThreadExcit_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class ThreadExit01 {
    public static void main(String[] args) throws InterruptedException {
        T t1 = new T();
        t1.start();

        //如果希望主线程 main  去控制修改 t1 线程的终止，就必须可修改  loop 就可以
        //让 t1 退出 run 方法，从而终止 t1 线程
        Thread.sleep(5000);//  让主线程休眠5秒后在终止
        //直接让 t1 调用  setLoop
        t1.setLoop(false);
    }
}
class T extends Thread{
   private  int count=0;
public boolean loop=(true);
    @Override
    public void run() {
        super.run();
        while (loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T 运行中。。。。。。"+(++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}