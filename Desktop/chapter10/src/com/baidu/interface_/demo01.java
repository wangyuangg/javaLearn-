package com.baidu.interface_;

public class demo01 {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(camera);
        computer.work(phone);
    }
}
