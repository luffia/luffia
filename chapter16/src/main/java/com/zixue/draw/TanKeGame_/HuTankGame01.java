package com.zixue.draw.TanKeGame_;

import javax.swing.*;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class HuTankGame01 extends JFrame {
    //先定义一个MyPanel
    MyPanel02 mp = null;

    public static void main(String[] args) {
        new HuTankGame01();
    }
    public HuTankGame01() {//构造器
        mp = new MyPanel02();//初始化面板
        //把面板放入窗口中,游戏的绘制区域
        this.add(mp);
        //设置窗口的大小
        this.setSize(1000, 750);
        //将窗口❌设置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置可以看见
        this.setVisible(true);

    }
}
