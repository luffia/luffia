package com.zixue.String_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BooleanSupplier;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class homeWork01 {
    public static void main(String[] args) {
        //自定义Book类，里面包含name、price，按price排序从大到小，要求；用两种方式排序，有一个Book【】books=4本书对象
        //使用Comparator接口匿名内部类，也称定制排序，按照price从小到大，按price排序从大到小，书名长度从大到小
        //Book【】books=new Book【4】；
        //books【0】=new Book（“红楼梦”，100）
        //books【1】=new Book（“金瓶梅新”，90）
        //books【2】=new Book（“青年文摘新版”，5）
        //books【3】=new Book（“Java从入门到放弃”，300）
        Book[] books = new Book[4];
       books [0] = new Book("红楼梦", 100);
     books[1] = new Book("金瓶梅❤新", 90);
      books [2] = new Book("青年文摘新版", 5);
       books [3] = new Book("java从入门到放弃", 500);
//price 从大到小
        Arrays.sort(books, new Comparator() {

            //如果是跟book数组排序因此o1跟o2就是Book对象
            @Override
            public int compare(Object o1, Object o2) {
                Book book1=(Book)o1;
                Book book2=(Book)o2;
               double priceVal=book2.getPrice()-book1.getPrice();
               //如果输出的不一样就输出1和-1。
               if (priceVal>0) {
               return -1;
               }else if (priceVal<0){
                   return 1;
               }else {
                   return 0;
               }
            }
        });
        System.out.println(Arrays.toString(books));

    }
}
class Book{
  private   String name;
   private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}