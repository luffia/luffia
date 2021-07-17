package com.zixue.MyTankGame4;

import java.util.Vector;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class EnemyTank extends Tank02 {
//    需要在敌人的坦克 增加属性 用Vector 包讯多个shot
  Vector<Shot> shots = new Vector<Shot>();
  boolean isLive=true;
    public EnemyTank(int x, int y) {
        super(x, y);
    }
}
