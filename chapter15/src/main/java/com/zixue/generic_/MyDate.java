package com.zixue.generic_;

import java.util.Comparator;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class MyDate implements Comparable<MyDate> {//指定泛型
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';

    }

    @Override
    public int compareTo(MyDate o) {
        //如果名字相同就在比较年月日的生日
        int yearMinus = year- o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }
        //如果名字相同生日年相同，n那么就比较月份
        int monthMinus = month- o.getMonth();
        if (monthMinus != 0) {
            return monthMinus;
        }
        //如果都相同那么就比较日//直接返回结果就可以不用在向上吗一样
        return day - o.getDay();
    }
}
