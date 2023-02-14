package com.baidu.abstract_;

public class Demo01 {
    public static void main(String[] args) {

    }
}
abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    //抽象方法就是指没有实现的方法
    public abstract void eat();
}
