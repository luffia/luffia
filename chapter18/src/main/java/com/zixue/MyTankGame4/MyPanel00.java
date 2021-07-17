package com.zixue.MyTankGame4;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.Vector;

//为了让 Panel00 不停重绘子弹，需要将 MyPanel00 做成线程
public class MyPanel00 extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    Hero02 hero02 = null;
    //定义敌人的坦克放入到Vector中
    Vector<EnemyTank> enemyTanks = new Vector();
    //    定义一个Vector，用于存放 Bomb
    //    当子弹击中坦克时候就加入一个Bomb对象到bombs
    Vector<Bomb> bombs = new Vector();
    int enemyTankSize = 3;
//    d定义三张炸弹的图片用于显示爆炸效果
    Image image1=null;
    Image image2=null;
    Image image3=null;

    public MyPanel00() {
        hero02 = new Hero02(100, 100);//初始化自己的坦克

        //初始化敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
//          设置方向
            enemyTank.setDirect(2);
//            ge给该 enemyTank 加入一个子弹
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
            enemyTank.shots.add(shot);
            new Thread(shot).start();
//            加入坦克
            enemyTanks.add(enemyTank);
        }
        //设置坦克的速度
//        hero02.setSpeed(5);
//        初始化图片
        Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
        URL resource = Panel.class.getResource("/images/bomb_1.gif");
        image1=defaultToolkit.getImage(resource);
        image1.flush();
        System.out.print(image1.getWidth(null));
        image2=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/images/bomb_2.gif"));
        image3=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/images/bomb_3.gif"));
        image2.flush();
        image3.flush();

    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//默认是黑色

        // 最后画出坦克的封装方法
        //  drawTank01(hero.getX(),hero.getY(),g,0,0); // 敌人的坦克
        drawTank(hero02.getX(), hero02.getY(), g, hero02.getDirect(), 1);//我自己的坦克

//        画出hero的坦克射击的子弹
        if (hero02.shot != null && hero02.shot.isLive == true) {
            // g.fill3DRect(hero02.shot.x, hero02.shot.y, 1, 1, false);
            g.draw3DRect(hero02.shot.x, hero02.shot.y, 3, 3, false);
        }
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
//            g根据当前这个bomb 对象的life值画出图片
            if (bomb.life>6){
                g.drawImage(image1,bomb.x,bomb.y,60,60,this);
            }else if (bomb.life>3){
                g.drawImage(image2,bomb.x,bomb.y,60,60,this);
            }else {
                g.drawImage(image3,bomb.x,bomb.y,60,60,this);
            }
//            r让炸弹的生命值减少
            bomb.lifeDown();
            if (bomb.life==0){
                bombs.remove(bomb);
            }
        }

        //画出敌人的坦克遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);

//            判断敌人的坦克是否还是存活的
            if (enemyTank.isLive) {   //如果是活的，则画出坦克
//             画出坦克
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);

//            画出  EnemyTank 所有子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
//                q取出子弹,然后返回
                    Shot shot = enemyTank.shots.get(j);
//                绘制：分析是否子弹是活的
                    if (shot.isLive) {//isLive ==true
                        g.draw3DRect(shot.x, shot.y, 3, 3, false);
                    } else {
//                    子弹不是活得就移除
                        enemyTank.shots.remove(shot);
                    }
                }
            }
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

    //    编写一个方法，判断我的坦克是否击中了敌人的坦克
//    什么时候判断我方坦克是否击中了敌人的坦克，用run方法循环
    public  void hitTank(Shot shot, EnemyTank enemyTank) {
        switch (enemyTank.getDirect()) {
            case 0://坦克向上
            case 2://坦克向下
                if (shot.x > enemyTank.getX() && shot.x < enemyTank.getX() + 40
                        && shot.y > enemyTank.getY() && shot.y < enemyTank.getY() + 40) {
                    shot.isLive = false;
                    enemyTank.isLive = false;
//                    c创建一个Bomb对象，加入到bombs集合中
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1://坦克向右，
            case 3://坦克向左
                if (shot.x > enemyTank.getX() && shot.x < enemyTank.getX() + 60
                        && shot.y > enemyTank.getY() && shot.y > enemyTank.getY() + 40) {
                    shot.isLive = false;
                    enemyTank.isLive = false;
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    public void keyTyped(KeyEvent e) {

    }

    //处理wdsa 键按下的情况
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
//       让面板重绘

//     当按下 J 键时候射击敌人的坦克
        if (e.getKeyCode() == KeyEvent.VK_J) {
//            测试 用户按下连 j
            System.out.println("用户按下连 J 开始射击。。。");
            hero02.shotEnemyTank();
        }
        this.repaint();
    }

    public void keyReleased(KeyEvent e) {

    }

    public void run() {//每隔100 毫秒，重绘区域,刷新绘图区域，子弹从而就移动起来
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            判断是否击中敌人的坦克
            if (hero02.shot != null && hero02.shot.isLive) {//判断如果我的子弹是否还是活得
                for (int i = 0; i < enemyTanks.size(); i++) {//不知道击中哪个坦克所以只能遍历
                    EnemyTank enemyTank = enemyTanks.get(i); //从集合中取出一个返回
                    hitTank(hero02.shot, enemyTank);
                }

            }
            this.repaint();
        }
    }
}