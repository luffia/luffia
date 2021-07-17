package com.zixue.MyTankGame3;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Tank02 {
    private int x;
    private int y;
    private int direct = 0;//坦克方向上右下左/默认是0
    private int speed = 1;//初始化速度

    //    上右下左
    public void moveUp() {
        y -= speed;
    }

    public void moveRight() {
        x += speed;
    }

    public void moveDown() {
        y += speed;
    }

    public void moveLeft() {
        x -= speed;
    }

    //提供speed的两个方法
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public Tank02(int direct) {
        this.direct = direct;
    }

    public Tank02(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
