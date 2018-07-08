package com.slick2d.snake.game.object.snake;

import com.slick2d.snake.game.enums.SnakeDirection;

/**
 * Created by LilG2pac on 29.05.2018.
 */
public class SnakePart {

    private int x;

    private int y;

    private SnakeDirection snakeDirection;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public SnakeDirection getSnakeDirection() {
        return snakeDirection;
    }

    public void setSnakeDirection(SnakeDirection snakeDirection) {
        this.snakeDirection = snakeDirection;
    }
}
