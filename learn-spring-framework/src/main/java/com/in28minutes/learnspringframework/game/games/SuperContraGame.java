package com.in28minutes.learnspringframework.game.games;

public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("Up");
    }
    public void down() {
        System.out.println("Down");
    }
    public void left() {
        System.out.println("Go back");
    }
    public void right() {
        System.out.println("Shoot a bullet");
    }
}
