package com.slick2d.snake.core.state;

import com.slick2d.snake.game.object.snake.Snake;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.util.Collections;

/**
 * Created by LilG2pac on 29.05.2018.
 */
public class GameState extends BasicGameState {

    public static int GAME_STATE_ID = 1;

    private Shape shape;

    private Snake snake;

    @Override
    public int getID() {
        return GAME_STATE_ID;
    }

    @Override
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {
        shape = new Rectangle(100, 100, 300, 300);
        snake = new Snake(Collections.emptyList());
    }

    @Override
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {
        graphics.setColor(new Color(0, 255, 255));//inside color
        graphics.fill(shape);
        graphics.draw(shape);
    }

    @Override
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException {

    }
}
