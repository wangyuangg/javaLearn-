package com.baidu.exercise_;

public class demo04 {
    public static void main(String[] args) {
        new A().f1();
        new A().show();
    }
}
class A{
    private String NAME = "mary";
    public void f1(){
        class B{
            private final String NAME = "tom";
            void show(){
                System.out.println(this.NAME+A.this.NAME);
            }
        }
        B b = new B();
        b.show();

    }

    void show(){
        System.out.println(NAME);
    }
}