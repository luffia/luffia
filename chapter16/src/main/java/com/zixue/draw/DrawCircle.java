package com.zixue.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class DrawCircle extends JFrame {//JFrame相当于一个画框，是一个窗口，在画框里面画东西
    //    1、定义一个面板为null空的
    private MyPanel01 mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        //2、初始化面板
        mp = new MyPanel01();
        // 3、把面板放入窗口即画框
        this.add(mp);
//         4、设置窗口的大小
        this.setSize(400, 300);
//        6、当点击窗口的小❌程序就真正的退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        5、设置可以显示
        this.setVisible(true);
    }
}

//首先制作一个画板MyPanel，继承JPanel类，（JPanel是Java提供的一个类）
////Graphics g可以把g理解成一支画笔
//Graphics 提供了很多绘图方法
class MyPanel01 extends JPanel {
    //绘图方法
    @Override
    public void paint(Graphics g) {//Graphics 绘图
        super.paint(g);//调用父类的方法完成初始化
        System.out.println("重新调用");//这个是为了测试改变面板大小一次会重新调用一次
        g.drawOval(10, 10, 100, 100);


        //第二张：演示绘制不同的图形
        //画直线
//        g.drawLine(10,10,100,100);

        //画矩形边框
//        g.drawRect(10,10,100,100);

        //填充矩形
        //先设置画笔的颜色
//        g.setColor(Color.BLUE);
//        g.fillRect(10,10,100,100);

        //填充椭圆
        g.setColor(Color.BLACK);
        g.fillOval(10,10,100,100);

        //画图片
//        首先加载获取图片资源
////     Bug    //"/bg.png"表示在项目的根目录获取图片
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/xbk.JPG"));
//        g.drawImage(image, 10, 10, 175, 200, this);
//
//         画字符串，首先给画笔设置字体和颜色
//        这里的X，Y指的是字体左下角的位置
        g.setColor(Color.BLUE);
        g.setFont(new Font("宋体",Font.BOLD,50));
        g.drawString("北京欢迎你",100,100);

    }
}