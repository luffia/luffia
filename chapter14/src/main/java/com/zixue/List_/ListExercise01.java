package com.zixue.List_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
@SuppressWarnings({"all"})
public class ListExercise01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // ArrayList list = new Vector();
    //    ArrayList list = new LinkedList();
        list.add(new Book("红楼梦", "曹雪芹", 90));
        list.add(new Book("三国", "罗贯中", 190));
        list.add(new Book("秦始皇", "花花", 20));
        //遍历
        for (Object o : list) {
            System.out.println(o);
        }
        sort(list);
//        冒泡排序
        System.out.println("===================");
        for (Object o : list) {
            System.out.println(o);
        }
    }

    //静态方法
    //从小到大
    public static void sort(ArrayList list) {
        int liseSize = list.size();
        for (int i = 0; i < liseSize - 1; i++) {
            for (int j = 0; j < liseSize - 1 - i; j++) {
                //取出对象
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                //  Book book3 =(Book) list.get(j);
                if (book1.getPrice() > book2.getPrice()) {//交换
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }

        }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "名称:" + name + "\t\t" +
                        "作者:" + author + "\t\t" +
                        "价格:" + price;
    }
}