package com.slick2d.snake.core.state;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by LilG2pac on 28.05.2018.
 */
public class MenuGameState extends BasicGameState {

    public static int MENU_GAME_STATE_ID = 0;

    public int getID() {
        return MENU_GAME_STATE_ID;
    }

    private Shape circle;
    private boolean collides;
    private float x = 300;
    private float y = 100;
    float speed = .25f;
    private Shape octagon;

    private boolean isStartGame;

    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {
        circle =  new Circle(100, 100, 50);// x, y, radius
        octagon = new Circle(x, y, 30, 8);//x, y, radius, number of segments
    }

    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {
        //set the color
       /* graphics.setColor(new Color(0, 255, 255));//inside color
        graphics.fill(circle);
        graphics.setColor(new Color(255, 0, 0));//red, green, blue OUTLINE of circle
        graphics.draw(circle);

        graphics.setColor(Color.magenta);
        graphics.draw(octagon);

        //just show whether the collision is changing or not
        graphics.drawString("Collides " + collides, 350, 30);*/
    }

    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException {
        if(isStartGame) {
            System.out.println(isStartGame);
           // stateBasedGame.addState(stateBasedGame.getState(GameState.GAME_STATE_ID));
            stateBasedGame.enterState(GameState.GAME_STATE_ID);
        }
    }

    @Override
    public void mouseMoved(int oldx, int oldy, int newx, int newy) {
        //System.out.println("oldx:" + oldx + ", oldy:" + oldy + ", newx:" + newx + ", newy:" + newy);
    }

    @Override
    public void mouseClicked(int button, int x, int y, int clickCount) {
        System.out.println("button:" + button + ", x:" + x + ", y:" + y + ", clickCount:" + clickCount);
        if(button == 0) {
            isStartGame = !isStartGame;
        }
    }
}
