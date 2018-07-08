package com.slick2d.snake.core;

import com.slick2d.snake.game.object.snake.Snake;

import java.util.Collections;

/**
 * Created by LilG2pac on 29.05.2018.
 */
public class SnakeInitializer {

    public Snake initializeSnake() {
        return new Snake(Collections.emptyList());
    }
}
