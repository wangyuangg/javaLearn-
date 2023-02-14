package com.baidu.cal_;

public class Demo01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.CalArea());
    }
}
class Circle{
    private double radius;
    private final double PI;
//构造器
    public Circle(double radius) {
        this.radius = radius;
        //PI = 3.14;
    }
    {
        PI = 3.14;
    }
    public double CalArea(){
        return PI * this.radius *this.radius;
    }
}
