package com.baidu.Date_;

import java.time.Instant;
import java.util.Date;

public class Instant_ {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        Date date = Date.from(now);//转过去
        Instant instant = date.toInstant();//转过来
    }
}
