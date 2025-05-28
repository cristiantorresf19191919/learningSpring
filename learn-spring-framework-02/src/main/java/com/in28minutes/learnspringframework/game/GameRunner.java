package com.in28minutes.learnspringframework.game;

import com.in28minutes.learnspringframework.game.games.GamingConsole;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.in28minutes.learnspringframework.game.games")
public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }
    public void run() {
        System.out.println("Running Game Started >> 🙏" + game);
        game.up();
        game.right();
        game.down();
        game.left();
        game.up();
        game.left();
        game.up();
        System.out.println("Game Finished << 🙏");
    }
}
