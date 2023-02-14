package com.baidu.exercise_;

public class demo05 {
    public static void main(String[] args) {
        Person tom = new Person("tom", new Boat());
        tom.commom();
    }
}
interface Vehicles{
    public void work();
}

class House implements Vehicles{
    @Override
    public void work() {
        System.out.println("乘马渡河");
    }
}

class Boat implements Vehicles{

    @Override
    public void work() {
        System.out.println("乘船渡河");
    }
}
class Person{

    private String name;
    private Vehicles Vehicles;
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.Vehicles = vehicles;
    }
    public void passRiver(){
        Boat boat = Factory.getBoat();
        boat.work();
    }
    public void commom(){
        House house = Factory.getHouse();
        house.work();
    }

}
class  Factory{
    public static House getHouse(){
        return new House();
    }
    public static Boat getBoat(){
        return new Boat();
    }

}