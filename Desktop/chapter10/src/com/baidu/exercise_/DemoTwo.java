package com.baidu.exercise_;

public class DemoTwo {
    public static void main(String[] args) {
        new Animal(){
            @Override
            void shout() {
                System.out.println("小狗叫");
            }
        }.shout();
    }
}
abstract class Animal{
    abstract void shout();
}
