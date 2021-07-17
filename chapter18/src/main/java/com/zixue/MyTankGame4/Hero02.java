package com.zixue.MyTankGame4;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Hero02 extends Tank02 {
//    创建一个 Shot 对象，表示一个射击
    Shot shot = null;
    public Hero02(int x, int y) {
        super(x, y);
    }
        //射击
        public void shotEnemyTank () {
            switch (getDirect()) {//坦克的方向
                case 0:
                    shot = new Shot(getX() + 20, getY(), 0);
                    break;
                case 1:
                    shot = new Shot(getX() + 60, getY() + 20, 1);
                    break;
                case 2:
                    shot = new Shot(getX() + 20, getY() + 60, 2);
                    break;
                case 3:
                    shot = new Shot(getX(), getY() + 20, 3);
            }
//            启动射击的 shot 线程
            new Thread(shot).start();
        }
    }
