package com.slick2d.snake.core.state;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by LilG2pac on 28.05.2018.
 */
public class StateBasedSnakeGame extends StateBasedGame {

    public StateBasedSnakeGame(String title) {
        super(title);
    }

    public void initStatesList(GameContainer gameContainer) throws SlickException {
        addState(new MenuGameState());
        addState(new GameState());
    }
}
