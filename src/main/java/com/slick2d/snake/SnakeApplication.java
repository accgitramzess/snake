package com.slick2d.snake;

import com.slick2d.snake.core.state.StateBasedSnakeGame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/**
 * Created by LilG2pac on 28.05.2018.
 */
public class SnakeApplication {

    public static void main(String[] args) throws SlickException {
        AppGameContainer appGameContainer = new AppGameContainer(
                new StateBasedSnakeGame("StateBasedSnakeGame 0.1")
        );
        appGameContainer.setDisplayMode(800, 600, false);
        appGameContainer.setAlwaysRender(true);

        appGameContainer.start();
    }
}
