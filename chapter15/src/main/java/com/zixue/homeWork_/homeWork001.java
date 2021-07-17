package com.zixue.homeWork_;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork001 {
    public static void main(String[] args) {
    }

    //在主方法中测试
    @Test
    public void testList() {
        //给泛型T指定类型是User（因为创建对象时才会确定泛型类型）
        DAO_<User_> dao = new DAO_<>();
//        使用sava方法保存
        dao.save("01", new User_(1, 20, "king"));
        dao.save("02", new User_(2, 24, "pum"));
        dao.save("03", new User_(3, 29, "wang"));


//        DAO里面有个list方法，返回所有的T对象
        List<User_> list = dao.list();
        System.out.println(list);


        //修改
        dao.update("03",new User_(22,44,"milan"));
        dao.delete("01");
        System.out.println("========================================");
        list=dao.list();
        System.out.println(list);
        System.out.println(dao.get("02"));

    }
}
