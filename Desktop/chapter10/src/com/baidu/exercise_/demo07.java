package com.baidu.exercise_;

import java.util.Scanner;

public class demo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        StringBuffer sb = new StringBuffer(next);
        //int i = sb.lastIndexOf(".");
        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb.insert(i , ",");
        }
        System.out.println(sb);


    }
}
