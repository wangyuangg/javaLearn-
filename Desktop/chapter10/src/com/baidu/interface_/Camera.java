package com.baidu.interface_;

public class Camera implements Usbinterface {
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
