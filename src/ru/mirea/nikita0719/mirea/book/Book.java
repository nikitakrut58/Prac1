package ru.mirea.nikita0719.mirea.book;

public class Book{
    private String name;
    private int pages;

    public Book (String n, int a) {
        name = n;
        pages = a;
    }
    public Book (String n) {
        name = n;
        pages = 0;
    }
    public Book () {
        name = "Histor";
        pages = 5;
    }
    public void setAge (int age) {
        this.pages = age;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String toString(String name) {
        return name;
    }
    public int getAge () {
        return pages;
    }
    public String toString(int age, String name) {
        return this.name+", age "+this.pages;
    }
    public void intoBookAge() {
        System.out.println (name+"'s has pages "+ pages *7);
    }
}