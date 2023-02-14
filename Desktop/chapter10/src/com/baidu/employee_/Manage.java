package com.baidu.employee_;

public class Manage extends Employee{
private double bounus;

    public Manage(String name, int id, double salary) {
        super(name, id, salary);
    }

    public double getBounus() {
        return bounus;
    }

    public void setBounus(double bounus) {
        this.bounus = bounus;
    }

    @Override
    public void work() {
        System.out.println("经理" + getName()+"工作中");
    }
}
