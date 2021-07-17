package com.zixue.Collections_;

import java.util.ArrayList;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
@SuppressWarnings({"all"})
public class homeWork0001 {
    public static void main(String[] args) {
        //封装一个新闻类，包含标题和内容属性，提供get、set方法。重写toString打印对象时至打印标题
        // 只提供一个带参数的构造器，实例化对象时，只初始化标题：并且实例化两个对象
        //    新闻一新馆确诊病例超千万，数百万印度教心到恒河“洗澡”引发民众担忧
        //    新闻二男子突然想起2个月前调的鱼还在网兜里，捞起一看放生
        //将新闻对象添加到ArrayList集中中，并进行倒叙遍历
        //在遍历集合过程中，对新闻标题进行处理，超过15个字的只保留前15个，然后再后面加“。。。。。”
        //在控制台打印遍历经过处理后的新闻标题
        ArrayList list = new ArrayList();
        list.add(new News("新馆确诊病例超千万，数百万印度教心到恒河洗澡引发民众担忧"));
        list.add(new News("男子突然想起2个月前调的鱼还在网兜里，捞起一看放生"));
        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            //   System.out.println(list.get(i));
            News news = (News) list.get(i);
            System.out.println(processTitle(news.getTitle()));
        }
    }

    //方法处理新闻标题processTitle处理标题
    public static String processTitle(String title) {
        if (title == null) {
            return " ";
        }
        if (title.length() > 15) {
            return title.substring(0, 15) + ".....";
        } else {
            return title;
        }
    }
}

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';

    }
}