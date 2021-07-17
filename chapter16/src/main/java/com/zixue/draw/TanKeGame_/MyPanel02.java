package com.zixue.draw.TanKeGame_;

import javax.swing.*;
import java.awt.*;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class MyPanel02 extends JPanel {
    //定义我的坦克
    Hero hero = null;

    public MyPanel02() {
        hero = new Hero(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//默认是黑色

        // 最后画出坦克的封装方法
        drawTank(hero.getX(),hero.getY(),g,0,0); // 我的坦克
        drawTank(hero.getX()+80,hero.getY(),g,0,1);//敌人的坦克

        }

    /**
     * @param x      坦克左上角的 x 坐标
     * @param y      坦克左上角的 y  坐标
     * @param g      画笔
     * @param direct 坦克的方向
     * @param type   坦克的类型
     **/
    //专门编写一个坦克的方法封装起来，后面调用
    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        //根据不同类型的坦克设置不同的颜色
        switch (type) {
            case 0://我们的坦克
                g.setColor(Color.cyan);
                break;

            case 1://敌人的坦克
                g.setColor(Color.yellow);
                break;
        }
//
//         根据坦克的类型画出坦克的具体模样？

        switch (direct) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.drawLine(x + 20, y+30, x + 20, y);
                g.fillOval(x+10,y+20,20,20);

        }

    }
}
