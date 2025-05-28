package com.in28minutes.learnspringframework.game.games;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {
    public void up() {
        System.out.println("Pacman Up ");
    }
    public void down() {
        System.out.println("Pacman Down");
    }
    public void left() {
        System.out.println("Pacman Go back");
    }
    public void right() {
        System.out.println("Pacman Go forward");
    }
}
