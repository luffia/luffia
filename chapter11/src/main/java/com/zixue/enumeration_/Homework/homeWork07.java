package com.zixue.enumeration_.Homework;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork07 {
    public static void main(String[] args) {
//将枚举对象在switch语句中匹配使用
     Color black= Color.BLACK;
     black.show();
     //在switch后面小括号放入枚举对象
        //在每个case后面  直接写上枚举类中    定义的枚举对象即可
     switch (black){
         case RED :
             System.out.println("匹配到红色");
         case BLUE:
             System.out.println("匹配到蓝色");
         case YELLOW:
             System.out.println("匹配到黄色");
         case BLACK:
             System.out.println("匹配到黑色");
             break;
         default:
             System.out.println("没匹配到颜色");
     }
    }
}
//Color枚举类，有RED，BLUE，BLACK，YELLOW，GREEN五个枚举值
//     Color有三个属性redValue，greenValue，blueValue
//创建构造器，参数包含上面三个属性
//每个枚举值都要给这是三个属性赋值，对应的值分别是
//red：255，0，0 。 blue0，0，255  black：0，0，0   yellow：255，255，0 。 green：0，255，0
//定义接口，里面有方法show，要求color实现该接口，show方法中显示三属性值，将枚举对象在switch语句中匹配使用
interface IA{
  public void show();
}

enum Color implements IA{
   RED(255,0,0) ,
    BLUE(0,0,255),
    BLACK(0,0,0),YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue,int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值为="+redValue+","+blueValue+","+greenValue);
    }
}