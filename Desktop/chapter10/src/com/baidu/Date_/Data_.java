package com.baidu.Date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data_ {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println(d1);
        SimpleDateFormat std = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = std.format(d1);
        System.out.println(format);
        String s = "1996年01月01日 10:20:30 星期一";
        Date prase = std.parse(s);
        System.out.println(prase);
    }
}
