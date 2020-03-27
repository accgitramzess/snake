package com.slick2d.snake.game.slice;

import com.slick2d.snake.game.enums.TurningSliceDirection;

/**
 * Created by LilG2pac on 29.05.2018.
 */
public class TurningSlice {

    /**
     * The idea of this object is that to store history where snake made turning slice
     *
     * Example :
     *
     *      1   2   3   4   5   6   7   8   9   10 - Y
     *
     * 1
     *
     * 2                            *********
     *                              *       *
     * 3                            *       *
     *                              *       ***** - snake tail
     * 4                            *
     *                              *
     * 5               **************
     *                 *
     * 6               *
     *            snake*head
     * 7
     *
     * 8
     * X
     *
     * TurningSlice are - (X5,Y4); (X5,Y7); (X2,Y7); (X2,Y9);
     */

    private Integer x;

    private Integer y;

    private TurningSliceDirection oldTurningSliceDirection;

    private TurningSliceDirection newTurningSliceDirection;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public TurningSliceDirection getOldTurningSliceDirection() {
        return oldTurningSliceDirection;
    }

    public void setOldTurningSliceDirection(TurningSliceDirection oldTurningSliceDirection) {
        this.oldTurningSliceDirection = oldTurningSliceDirection;
    }

    public TurningSliceDirection getNewTurningSliceDirection() {
        return newTurningSliceDirection;
    }

    public void setNewTurningSliceDirection(TurningSliceDirection newTurningSliceDirection) {
        this.newTurningSliceDirection = newTurningSliceDirection;
    }
}
