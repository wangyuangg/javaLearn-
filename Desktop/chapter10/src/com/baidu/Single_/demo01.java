package com.baidu.Single_;


public class demo01 {
    public static void main(String[] args) {
        //System.out.println(Cat.getInstance());
        Cat getInstance = Cat.getInstance();
        System.out.println(getInstance);
        Cat getInstance1 = Cat.getInstance();
        System.out.println(getInstance1);
    }
}

class Cat {
    private String name;
   private static Cat cat;

    private Cat(String name) {
        System.out.println("this is 构造器");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public static Cat getInstance(){
        if (cat == null){
            cat = new Cat("小可爱");
        }
        return cat;
    }

}