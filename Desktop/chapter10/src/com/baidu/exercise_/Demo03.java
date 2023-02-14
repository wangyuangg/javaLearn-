package com.baidu.exercise_;

public class Demo03 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork((double n1, double n2) -> n1 + n2, 10, 8);

    }
}

interface Computer {
    public double work(double n1, double n2);
}

class Cellphone {
    public void testWork(Computer computer, double n1, double n2) {
        double result = computer.work(n1, n2);
        System.out.println("" + result);
    }
}