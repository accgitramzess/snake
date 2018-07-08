package com.slick2d.snake.game.object.bonus;

import com.slick2d.snake.game.object.bonus.factory.BonusFactory;

import java.util.Objects;

/**
 * Created by LilG2pac on 28.05.2018.
 */
public class BonusManager {

    public static final int BONUS_LIFETIME = 60 * 60; // SET TIME IN MILLISECONDS

    private Bonus prevBonus;

    private BonusFactory bonusFactory;

    public BonusManager(BonusFactory bonusFactory) {
        this.bonusFactory = bonusFactory;
    }

    public Bonus getBonus() {

        if(Objects.isNull(prevBonus)) {
            prevBonus = bonusFactory.createBonus();
            return prevBonus;
        }

        long delta = System.currentTimeMillis() - prevBonus.getStartLifeTime();

        if(delta >= BonusManager.BONUS_LIFETIME) {
            return bonusFactory.createBonus();
        }

        return prevBonus;
    }
}
