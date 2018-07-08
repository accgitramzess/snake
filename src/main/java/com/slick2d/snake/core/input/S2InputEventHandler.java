package com.slick2d.snake.core.input;

import com.slick2d.snake.game.context.SnakeGameContext;

import org.newdawn.slick.GameContainer;

/**
 * Created by LilG2pac on 31.05.2018.
 */
public interface S2InputEventHandler {

    void handleInputEvent(GameContainer gameContainer, SnakeGameContext snakeGameContext);
}
