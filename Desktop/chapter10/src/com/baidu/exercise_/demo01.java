package com.baidu.exercise_;

public class demo01 {
    public static void main(String[] args) {
        int nextNum = Frock.getNextNum();
        System.out.println(nextNum);
        nextNum = Frock.getNextNum();
        System.out.println(nextNum);
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());


    }

}

class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}