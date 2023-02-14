package com.baidu.static_;

public class ChildGame {
    public static void main(String[] args) {

        Child child1 = new Child("白骨精");
        child1.join();
        Child.count++;
        Child child2 = new Child("狐狸精");
        child2.join();
        Child.count++;
        Child child3 = new Child("老鼠精");
        child3.join();
        Child.count++;
        System.out.println(Child.count++);
    }
}

class Child {
    private String name;
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏...");
    }
}
