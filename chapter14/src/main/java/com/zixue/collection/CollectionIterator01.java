package com.zixue.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class CollectionIterator01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国", "罗", 55));
        col.add(new Book("红楼", "曹学琴", 90));
        col.add(new Book("小飞到", "闪闪", 66));
        //   System.out.println(col);
        //遍历输出clo集合
        //1、先得到 col 对应的迭代器
        Iterator iterator = col.iterator();
        ///2、使用while循环遍历
//        使用快捷键
        while (iterator.hasNext()) {   //判断下面还有没有数据
            //返回下一个元素类型是Object，运行类型取决于存放的是什么对象
            Object obj = iterator.next();
            System.out.println(obj);
//            3、当迭代器退出while循环后，这时iterator迭代器，指向最后的元素
            //   再次遍历输出则会抛出异常
            //如果需要再次遍历，需要重置迭代器
            Iterator iterator1 = col.iterator();
            System.out.println("========再次遍历输出结果=======");
            while (iterator1.hasNext()) {
                Object next = iterator1.next();
                System.out.println(next);
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
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}