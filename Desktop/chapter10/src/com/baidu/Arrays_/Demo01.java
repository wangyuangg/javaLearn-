package com.baidu.Arrays_;


import java.util.Arrays;
import java.util.Comparator;

public class Demo01 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("金瓶梅",90);
        books[2] = new Book("青年文摘",5);
        books[3] = new Book("java从入门到放弃",300);
        Arrays.sort(books, Comparator.comparingInt(Book::getPrice));

        System.out.println(Arrays.toString(books));
    }
}
class Book {
    private String name;
    private int price;
    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}