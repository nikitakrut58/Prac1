package ru.mirea.nikita0719.mirea.ball;
import java.lang.*;

public class TestBall {
    public static void main (String[] args) {
        Ball b1 = new Ball ("K37", 4);
        Ball b2 = new Ball ("Hev10", 2);
        Ball b3 = new Ball ("B07", 8);
        b3.setAge(1);
        System.out.println(b1);
        b1.intoBallAge();
        b2.intoBallAge();
        b3.intoBallAge();
    }
}