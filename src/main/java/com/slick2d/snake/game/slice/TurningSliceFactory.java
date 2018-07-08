package com.slick2d.snake.game.slice;

import com.slick2d.snake.game.enums.TurningSliceDirection;

/**
 * Created by LilG2pac on 30.05.2018.
 */
public class TurningSliceFactory {

    public TurningSlice createTurningSlice(Integer x,
                                           Integer y,
                                           TurningSliceDirection oldTurningSliceDirection,
                                           TurningSliceDirection newTurningSliceDirection) {

        TurningSlice turningSlice = new TurningSlice();
        turningSlice.setX(x);
        turningSlice.setY(y);
        turningSlice.setOldTurningSliceDirection(oldTurningSliceDirection);
        turningSlice.setNewTurningSliceDirection(newTurningSliceDirection);

        return turningSlice;
    }
}
