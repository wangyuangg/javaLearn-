package com.baidu.Date_;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1);
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
    }
}
