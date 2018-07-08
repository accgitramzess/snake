package com.slick2d.snake.game.object.bonus.factory;

import com.slick2d.snake.game.object.bonus.Bonus;

import java.util.Random;

/**
 * Created by LilG2pac on 28.05.2018.
 */
public class BonusFactory {

    private int boundX;

    private int boundY;

    private Random random;

    public BonusFactory(int boundX, int boundY) {
        this.boundX = boundX;
        this.boundY = boundY;
        this.random = new Random();
    }

    public Bonus createBonus() {

        Bonus bonus = new Bonus();

        int x = random.nextInt(boundX) + 1;
        int y = random.nextInt(boundY) + 1;

        bonus.setX(x);
        bonus.setY(y);

        bonus.setStartLifeTime(System.currentTimeMillis());

        return bonus;
    }
}
