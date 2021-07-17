package com.zixue.date_;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Locale;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class Date01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getMinute());

        //通过静态方式实现
        Instant now = Instant.now();
        System.out.println(now);

    }
}
