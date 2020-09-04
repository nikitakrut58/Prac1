package ru.mirea.nikita0719.mirea.book;
import java.lang.*;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Room", 4);
        Book b2 = new Book("Haven", 1);
        Book b3 = new Book("JoeHistory", 3);
        b3.setAge(1);
        System.out.println(b1);
        b1.intoBookAge();
        b2.intoBookAge();
        b3.intoBookAge();
    }
}