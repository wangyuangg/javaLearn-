package com.baidu.Date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_ {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        DateTimeFormatter formate = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm:ss E");
        System.out.println(formate.format(time));

    }

}
