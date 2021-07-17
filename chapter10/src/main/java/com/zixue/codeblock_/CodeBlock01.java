package com.zixue.codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        new Movie("你好，李焕英");
        new Movie("夏天的封装",100,"小汤");
    }
}
class Movie{
    private String name;
    private double price;
    private String director;

    //构造器。。。。重载

    //下面的构造器都有相同的语句
    //这样就比较冗余
    //这时候我们把相同的语句放到一个代码块中
    //当我们不管调用哪个构造器，创建对象，都会先调用代码块中的内容
    //代码块调用的顺序优先于构造器：举例说明
    {
        System.out.println("电影屏幕打开");
        System.out.println("电影开始类");
        System.out.println("电影结束类");
    }

    public Movie(String name) {
        System.out.println("Movie.(String name)  被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("Movie.(String name, double price, String director)被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}