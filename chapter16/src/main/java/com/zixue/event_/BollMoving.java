package com.zixue.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
////演示小球通过键盘上下左右移动
public class BollMoving extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        new BollMoving();
    }

    public BollMoving() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);

        //这句话加入后可以使窗口JFrame,对象可以监听键盘事件，即可以监听到面板所发生的键盘事件
        this.addKeyListener(mp);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}
//写个面板

//最后写移动 KeyListener 是一个监听器
class MyPanel extends JPanel implements KeyListener {

    //为了让小球可以移动，把小球走上脚的坐标 （x，y）设置为变量
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);//默认黑色填充的小求
    }

    //有字符输出时，该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当某个键按下，该方法会触发
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char) e.getKeyCode() + "被按下......");
//
//        根据用户按下的不同键来控制小球的移动
//
//        Java中会给每个键分配一个值，int
//        KeyEvent事件对象
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {//KeyEvent.VK_DOWN就是向下的箭头对应的code

            y++;
        }else if (e.getKeyCode()==KeyEvent.VK_UP){
            y--;
        }else if (e.getKeyCode()==KeyEvent.VK_LEFT){
            x--;
        }else if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            x++;
        }
        //让面板重绘
        this.repaint();
    }

    //当某个键释放松开，这个方法会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}