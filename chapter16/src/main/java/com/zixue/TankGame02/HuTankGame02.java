package com.zixue.TankGame02;

import com.zixue.draw.TanKeGame_.MyPanel02;

import javax.swing.*;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class HuTankGame02 extends JFrame {
    //先定义一个MyPanel
    MyPanel00 mp = null;

    public static void main(String[] args) {
        new HuTankGame02();
    }
    public HuTankGame02() {//构造器
        mp = new MyPanel00();//初始化面板
        //把面板放入窗口中,游戏的绘制区域
        this.add(mp);
        //设置窗口的大小
        this.setSize(1000, 750);

        //让JFrame监听mp的键盘事件
        this.addKeyListener(mp);

        //将窗口❌设置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置可以看见
        this.setVisible(true);


    }
}
