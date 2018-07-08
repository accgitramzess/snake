package com.slick2d.snake.game.object.bonus;

import com.slick2d.snake.game.object.bonus.factory.BonusFactory;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by LilG2pac on 29.05.2018.
 */
public class BonusManagerTest {

    @Test
    public void bonusManagerRegenerationTest_BonusObjectDataMustBeTheSame() {
        int boundX = 10;
        int boundY = 10;

        BonusManager bonusManager = new BonusManager(new BonusFactory(boundX, boundY));

        Bonus initialBonus = bonusManager.getBonus();
        Bonus regeneratedBonus = bonusManager.getBonus();

        assertEquals(initialBonus.getX(), regeneratedBonus.getX());
        assertEquals(initialBonus.getY(), regeneratedBonus.getY());
    }

    @Test
    public void bonusManagerRegenerationTest_BonusObjectDataMustBeANew() throws InterruptedException {
        int boundX = 10;
        int boundY = 10;

        BonusManager bonusManager = new BonusManager(new BonusFactory(boundX, boundY));

        Bonus initialBonus = bonusManager.getBonus();

        TimeUnit.SECONDS.sleep(65);

        Bonus regeneratedBonus = bonusManager.getBonus();

        assertNotEquals(initialBonus.getX(), regeneratedBonus.getX());
        assertNotEquals(initialBonus.getY(), regeneratedBonus.getY());
    }
}
