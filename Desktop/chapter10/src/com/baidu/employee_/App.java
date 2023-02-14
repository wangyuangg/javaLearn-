package com.baidu.employee_;

public class App {
    public static void main(String[] args) {
        Manage manage = new Manage("jack", 999, 3000.0);
        manage.setBounus(8000);
        manage.work();
        new Common("tom", 888, 5000).work();
    }
}
