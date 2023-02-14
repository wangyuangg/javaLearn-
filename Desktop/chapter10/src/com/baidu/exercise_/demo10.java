package com.baidu.exercise_;

public class demo10 {
    public static void main(String[] args) {

    }

    public void print(String name){
        if (name == null){
            System.out.println("str不能为空");
            return;
        }
        String[] str = name.split(" ");
        if (name.length()!=3){
            System.out.println("输入的字符串格式不对");
            return;
        }
        String.format("%s %s %s",str[2],str[0],str[1].toUpperCase().charAt(0));
    }
}
