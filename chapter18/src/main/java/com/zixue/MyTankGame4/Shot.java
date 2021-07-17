package com.zixue.MyTankGame4;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Shot implements Runnable {
    int x;//子弹的 x 坐标
    int y;//子弹的 y 坐标
    int direct = 0;//子弹的 方向 默认0
    int speed = 2;
    boolean isLive = true; //子弹是否存活

    public Shot(int x, int y, int direct) {// 构造器  射击的坐标、方向
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(50); //子弹先休眠一下
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //根据方向来改变 x y 坐标
            switch (direct) {
                case 0: //子弹向上
                    y -= speed;
                    break;
                case 1:
                    x += speed;
                    break;
                case 2:
                    y += speed;
                    break;
                case 3:
                    x -= speed;
                    break;
            }
//            测试用
            System.out.println("子弹x ="+x+"子弹y="+y);
//            当子弹碰到敌人坦克时候也应该销毁,也应该结束线程  增加 isLive
//            当子弹移动到面板边界时候，就应该销毁（把启动的子弹的线程销毁）
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) {//判断子弹的范围
                isLive = false;//超出范围就子弹就死掉了
                break;
            }
        }
    }
}
