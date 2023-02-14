package com.baidu.exercise_;

public class Demo09 {
    public static void main(String[] args) {

    }

    public static boolean judge(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] >= '9') {
                return false;
            }
        }
        return true;
    }

    public static void rigister(String name, String pwd, String email) {
        int length = name.length();
        if (!(length >= 2 && length <= 4)) {
            throw new RuntimeException("用户名错误");
        }
        if (!(pwd.length() == 6 && judge(pwd))){
            throw new RuntimeException("密码要求全是数字");
        }
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i>0&&j>i)){
            throw new RuntimeException("邮箱错误");
        }

    }
}
