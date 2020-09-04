package ru.mirea.nikita0719.mirea.ball;
import java.lang.*;

public class Ball{
    private String name;
    private int radius;

    public Ball (String n, int a) {
        name = n;
        radius = a;
    }
    public Ball (String n) {
        name = n;
        radius = 0;
    }
    public Ball () {
        name = "B13";
        radius = 5;
    }
    public void setAge (int age) {
        this.radius = age;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String toString(String name) {
        return name;
    }
    public int getAge () {
        return radius;
    }
    public String toString(int age, String name) {
        return this.name+", age "+this.radius;
    }
    public void intoBallAge() {
        System.out.println (name+"'s has a radius "+ radius *7);
    }
}