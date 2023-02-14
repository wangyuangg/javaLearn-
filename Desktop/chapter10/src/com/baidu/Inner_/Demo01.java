package com.baidu.Inner_;

public class Demo01 {
    public static void main(String[] args) {
        Outer outer = new Outer(50);
        outer.m1();
    }
}

class Outer {
    private int n1 = 100;

    private void m2() {
        System.out.println("02");
    }

    public Outer(int n1) {
        this.n1 = n1;
    }

    public void m1() {
        final class Inner {
            private int n1 = 800;
            public void f1() {
                System.out.println("n1=" + Outer.this.n1);
                m2();
            }
        }
        Inner inner = new Inner();
        inner.f1();
    }
}
