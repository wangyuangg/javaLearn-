package com.baidu.exercise_;

public class Demo08 {
    public static void main(String[] args) {
        System.out.println(reserve("abcdef", 1, 4));
    }

    public static String reserve(String str, int start, int end) {
        if (!(str != null && start >= 0 && end > start && end < str.length())){
            throw  new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
