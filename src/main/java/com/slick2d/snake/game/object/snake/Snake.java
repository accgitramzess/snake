package com.slick2d.snake.game.object.snake;

import com.slick2d.snake.game.enums.SnakeDirection;
import com.slick2d.snake.game.slice.TurningSlice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by LilG2pac on 29.05.2018.
 */
public class Snake {

    private static final int HEAD_SNAKE_INDEX = 0;

    private List<SnakePart> snake;

    private List<TurningSlice> turningSlices;

    public Snake(List<SnakePart> snake) {
        this.turningSlices = new ArrayList<>();
        this.snake = new ArrayList<>();
    }

    public SnakePart getHead() {
        return this.snake.get(HEAD_SNAKE_INDEX);
    }

    public void addBodyPart(SnakePart snakePart) {
        snake.add(snakePart);
    }

    public void addTurningSlice(TurningSlice turningSlice) {
        turningSlices.add(turningSlice);
    }

    public void changeDirection(SnakeDirection snakeDirection) {
        SnakePart snakePart = snake.get(HEAD_SNAKE_INDEX);
        snakePart.setSnakeDirection(snakeDirection);
    }

    public void move(Consumer moveConsumer) {
        snake.stream()
                .filter(snakePart -> snakePart.getSnakeDirection().equals(SnakeDirection.LEFT))
                .forEach(moveConsumer);

        snake.stream()
                .filter(snakePart -> snakePart.getSnakeDirection().equals(SnakeDirection.DOWN))
                .forEach(moveConsumer);

        snake.stream()
                .filter(snakePart -> snakePart.getSnakeDirection().equals(SnakeDirection.RIGHT))
                .forEach(moveConsumer);

        snake.stream()
                .filter(snakePart -> snakePart.getSnakeDirection().equals(SnakeDirection.UP))
                .forEach(moveConsumer);
    }
}
