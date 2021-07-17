package com.zixue.MyTurtles_;//package com.zixue.MyTurtles_;
//
//import javax.swing.*;
//import java.awt.*;
//
///**
// * @author 嘟嘟的掌柜
// * @constellation 白羊座
// */
//public class MyPanel extends JPanel {
//    //10、定义我自己的小乌龟为空的null
//    Turtle00 turtle00 = null;
//
//    //    11、在构造器中初始化小乌龟
//    public MyPanel() {
//        turtle00 = new Turtle00(200, 200);
//    }
//
//    //    12、开始绘图，先写一个绘图的方法调用.直接打出 paint 选择 方法 即可
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
////        最后一
//        g.setColor(Color.white);//设置面板的颜色
//        g.fillRect(0, 0, 900, 750);//默认是黑色
//
//        //画出乌龟的封装
//        drawTurtle00(turtle00.getX(), turtle00.getY(), g, 0, 0);
//    }
//
//    /**
//     * @param x      左上角的 x 坐标
//     * @param y      左上角的 y  坐标
//     * @param g      画笔
//     * @param direct 的方向
//     * @param type   类型
//     **/
//
////    13、编写一个乌龟的方法封装起来
//    public void drawTurtle00(int x, int y, Graphics g, int type, int direct) {
////        14、根据不同类型的乌龟进行设置
////        switch (type){
////            case 0://0代表我自己的小乌龟
////                g.setColor(Color.red);
////                break;
////            case 1://别人的乌龟
////                g.setColor(Color.BLUE);
////                break;
////        }
//////        15、画出乌龟的具体模样，用连续的g。做出
////        switch (direct){
////            case 0:
//        g.setColor(Color.red);
//        g.fillOval(x - 40, y + 30, 100, 150);
//        g.setColor(Color.green);
//        g.fillOval(x - 10, y - 30, 40, 30);
//        g.fillOval(x, y - 35, 5, 5);
//        g.fillOval(x+20, y - 35, 5, 5);
//        g.fill3DRect(x, y - 4, 20, 40, false);
//        g.fillOval(x-68,y+108,30,20);
//        g.fillOval(x+58,y+108,30,20);
//
//        g.fillOval(x-55,y+40,30,20);
//        g.fillOval(x+45,y+40,30,20);
//        g.drawLine(x+10,y+190,x+50,y+180);
//
//
//
////        }
//    }
//}
