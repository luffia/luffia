package com.zixue.TankGame02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
//为了监听键盘事件，我们要实现接口KeyListen
class MyPanel00 extends JPanel implements KeyListener {
    //定义我的坦克
    Hero02 hero02 = null;
    //定义敌人的坦克放入到Vector中
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;

    public MyPanel00() {

        hero02 = new Hero02(100, 100);//初始化自己的坦克

        //初始化敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
          EnemyTank enemyTank = new EnemyTank((100*(i+1)), 0);
//          设置方向
            enemyTank.setDirect(2);
//            加入坦克
            enemyTanks.add(enemyTank);
        }
        //设置坦克的速度
        hero02.setSpeed(5);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//默认是黑色

        // 最后画出坦克的封装方法
        //  drawTank01(hero.getX(),hero.getY(),g,0,0); // 敌人的坦克
        drawTank(hero02.getX(), hero02.getY(), g, hero02.getDirect(), 1);//我自己的坦克

        //画出敌人的坦克遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出坦克
     EnemyTank  enemyTank =  enemyTanks.get(i);
//             画出坦克
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),0);

        }



    }

    /**
     * @param x      坦克左上角的 x 坐标
     * @param y      坦克左上角的 y  坐标
     * @param g      画笔
     * @param direct 坦克的方向
     * @param type   坦克的类型
     **/

    //为了监听键盘事件，我们要实现接口KeyLisner
    //专门编写一个坦克的方法封装起来，后面调用
    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        //根据不同类型的坦克设置不同的颜色
        switch (type) {
            case 0://敌人的坦克
                g.setColor(Color.cyan);
                break;

            case 1://我的坦克
                g.setColor(Color.yellow);
                break;
        }
//
//         根据坦克的类型画出对应坦克的具体模样上下左右

        switch (direct) {//0上，1右，2下，3左
            case 0://表示向上
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.drawLine(x + 20, y + 30, x + 20, y);
                g.fillOval(x + 10, y + 20, 20, 20);
                break;

            case 1://表示向右
                g.fill3DRect(x, y, 60, 10, false);//坦克轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//坦克轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//坦克盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//泡桐
                g.fillOval(x + 20, y + 10, 20, 20);//圆形的盖子
                break;

            case 2://表示向下
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//只改这个就可以
                g.fillOval(x + 10, y + 20, 20, 20);
                break;

            case 3://表示向左
                g.fill3DRect(x, y, 60, 10, false);//坦克轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//坦克轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//坦克盖子
                g.drawLine(x + 30, y + 20, x, y + 20);//泡桐
                g.fillOval(x + 20, y + 10, 20, 20);//圆形的盖子
                break;
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wdsa 键按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            //改变坦克的方向
            hero02.setDirect(0);
            //修改坦克坐标
            hero02.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {//D向右
            hero02.setDirect(1);
            hero02.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero02.setDirect(2);
            hero02.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero02.setDirect(3);
            hero02.moveLeft();
        }
//让面板重绘
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
