package com.in28minutes.learnspringframework.game.games;

public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go into a hole");
    }

    public void left() {
        System.out.println("Go Back");
    }

    public void right() {
        System.out.println("Accelerate");
    }
}
