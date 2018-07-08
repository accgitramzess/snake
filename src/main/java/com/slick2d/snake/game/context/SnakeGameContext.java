package com.slick2d.snake.game.context;

import com.slick2d.snake.game.object.snake.Snake;

/**
 * Created by LilG2pac on 29.05.2018.
 */
public class SnakeGameContext {

    private Snake snake;

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }
}
