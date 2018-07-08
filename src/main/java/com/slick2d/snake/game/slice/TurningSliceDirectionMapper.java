package com.slick2d.snake.game.slice;

import com.slick2d.snake.game.enums.SnakeDirection;
import com.slick2d.snake.game.enums.TurningSliceDirection;

/**
 * Created by LilG2pac on 30.05.2018.
 */
public class TurningSliceDirectionMapper {

    public TurningSliceDirection map(SnakeDirection snakeDirection) {
        switch (snakeDirection) {
            case LEFT:
                return TurningSliceDirection.LEFT;
            case DOWN:
                return TurningSliceDirection.DOWN;
            case RIGHT:
                return TurningSliceDirection.RIGHT;
            case UP:
                return TurningSliceDirection.UP;
            default:
                throw new RuntimeException("Error map TurningSliceDirection from " + snakeDirection);
        }
    }
}
