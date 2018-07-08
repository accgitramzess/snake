package com.slick2d.snake.game.object.bonus;

/**
 * Created by LilG2pac on 28.05.2018.
 */
public class Bonus {

    private int x;

    private int y;

    private long startLifeTime;

    public Bonus() {
        this.startLifeTime = System.currentTimeMillis();
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setStartLifeTime(long startLifeTime) {
        this.startLifeTime = startLifeTime;
    }

    public long getStartLifeTime() {
        return startLifeTime;
    }
}
