package com.zixue.MyTankGame4;

import java.util.Vector;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class EnemyTank extends Tank02 implements Runnable {
    //    需要在敌人的坦克 增加属性 用Vector 包讯多个shot
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true) {
//            g根据坦克 的方向来继续移动
            switch (getDirect()) {
                case 0:
//                    让坦克保持一个方向走30 步
                    for (int i = 0; i < 30; i++) {
                        if (getY()>0) { //  s设置移动范围
                            moveUp();//多让那个坦克移动几步再随机换方向
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (getX()+60<1000) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < 30; i++) {
                        if (getY()+60<750) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < 30; i++) {
                        if (getX()>0) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }

            //            随机的改变坦克的方向 0-3
            setDirect((int) (Math.random() * 4));
            if (!isLive) {
                break;//退出线程
            }
        }
    }
}
