package com.in28minutes.learnspringframework.game;

import com.in28minutes.learnspringframework.game.games.GamingConsole;
import com.in28minutes.learnspringframework.game.games.MarioGame;
import com.in28minutes.learnspringframework.game.games.PacmanGame;
import com.in28minutes.learnspringframework.game.games.SuperContraGame;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {

    @Bean
    @Qualifier("pacmanGame")
    public GamingConsole game(){
        return new PacmanGame();
    }

    @Bean
    public GamingConsole pacmanGame() {
        return new PacmanGame();
    }

    @Bean
    public GamingConsole marioGame() {
        return new MarioGame();
    }

    @Bean
    public GamingConsole superContraGame() {
        return new SuperContraGame();
    }

    @Bean
    @Primary
    public GameRunner gameRunner(@Qualifier("pacmanGame") GamingConsole game5) {
        return new GameRunner(game5);
    }

    @Bean GameRunner gameRunner2() {
        return new GameRunner(new MarioGame());
    }
}
