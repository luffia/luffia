package com.zixue.MyTankGame4;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Bomb {
    int x,y;
    int life=9;//炸弹生命周期
    boolean isLive=true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }
//    减少生命值，
    public void lifeDown(){//为了配合出现图片的爆炸效果
        if (life>0){
            life--;
        }else {
            isLive=false;
        }
    }
}
//炸弹放在Panel中