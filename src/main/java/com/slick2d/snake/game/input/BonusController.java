package com.slick2d.snake.game.input;

import com.slick2d.snake.game.object.bonus.Bonus;
import com.slick2d.snake.game.object.bonus.BonusManager;
import com.slick2d.snake.game.context.SnakeGameContext;
import com.slick2d.snake.game.object.bonus.CollisionDetector;
import com.slick2d.snake.core.input.S2InputEventHandler;

import org.newdawn.slick.GameContainer;

/**
 * Created by LilG2pac on 30.05.2018.
 */
public class BonusController implements S2InputEventHandler {

    private BonusManager bonusManager;

    private CollisionDetector collisionDetector;

    public BonusController(BonusManager bonusManager, CollisionDetector collisionDetector) {
        this.bonusManager = bonusManager;
        this.collisionDetector = collisionDetector;
    }

    @Override
    public void handleInputEvent(GameContainer gameContainer, SnakeGameContext snakeGameContext) {
        Bonus bonus = bonusManager.getBonus();
        boolean result = collisionDetector.detectCollision();
        if(result) {
            /*
             TODO : since snake is growing need trigger event for that. Need think about creation event based system to handle those type of events.
             TODO : also need think about to be able register input handler only to special events not fo all because it will cause unintended processor costs.
              */
        } /*else {
            // TODO : Since nothing happens, then just ignore it.
        }*/
    }
}
