package com.in28minutes.learnspringframework.game;

import com.in28minutes.learnspringframework.game.games.MarioGame;
import com.in28minutes.learnspringframework.game.games.PacmanGame;
import com.in28minutes.learnspringframework.game.games.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            var gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();
        }
    }
}
