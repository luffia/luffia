package com.zixue.generic_;

import java.util.*;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class GenericExercise01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
//        使用泛型创建3个学生对象放在Hash Set
        HashSet<Stu> stus = new HashSet<>();
        stus.add(new Stu("jack", 22));
        stus.add(new Stu("jak", 23));
        stus.add(new Stu("smith", 42));

        //遍历
        for (Stu stu : stus) {
            System.out.println(stu);
        }
//使用泛型给HashMap
        System.out.println("==================HashMap================");
        HashMap<String, Stu> map1 = new HashMap<String, Stu>();
        map1.put("milian", new Stu("milian", 33));
        map1.put("kuke", new Stu("kuke", 31));
        map1.put("lanhua", new Stu("lanhua", 35));
        System.out.println(map1);

        //迭代器遍历
        System.out.println("============================================");
        Set<Map.Entry<String, Stu>> entries = map1.entrySet();
        Iterator<Map.Entry<String, Stu>> iterator = entries.iterator();//自动替换
        while (iterator.hasNext()) {
            Map.Entry<String, Stu> next = iterator.next();
            System.out.println(next.getKey() + "--" + next.getValue());
        }
    }
}

//创建3个学生对象放在Hash Set
//放到HashMap中，要求Key是String name，Value是学生对象
//使用两种方式遍历
class Stu {
    private String name;
    private int age;

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}