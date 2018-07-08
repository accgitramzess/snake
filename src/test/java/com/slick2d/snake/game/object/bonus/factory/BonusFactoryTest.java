package com.slick2d.snake.game.object.bonus.factory;

import com.slick2d.snake.game.object.bonus.Bonus;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by LilG2pac on 29.05.2018.
 */
public class BonusFactoryTest {

    @Test
    public void generatorCommonCaseTest_ShouldEnrichBnousObjectWithData() {

        int boundX = 10;
        int boundY = 10;

        BonusFactory bonusFactory = new BonusFactory(boundX, boundY);
        Bonus bonus = bonusFactory.createBonus();

        assertNotNull(bonus);
        assertTrue(bonus.getX() <= boundX);
        assertTrue(bonus.getY() <= boundY);
    }
}
