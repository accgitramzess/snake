package com.slick2d.snake.core.input;

import com.slick2d.snake.game.context.SnakeGameContext;

import org.newdawn.slick.GameContainer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LilG2pac on 29.05.2018.
 */
public class S2InputEventHandlerManager {

    private List<S2InputEventHandler> singleInputHandlers;

    private List<S2InputEventHandler> allInputHandlers;

    public S2InputEventHandlerManager() {
        this.singleInputHandlers = new ArrayList<>();
        this.allInputHandlers = new ArrayList<>();
    }

    public void registerInputController(S2InputEventHandler s2InputEventHandler) {
        singleInputHandlers.add(s2InputEventHandler);
    }

    public void handleInputEvent(GameContainer gameContainer, SnakeGameContext snakeGameContext) {
        this.invokeSingleInputControllers(gameContainer, snakeGameContext);
        this.invokeAllInputControllers(gameContainer, snakeGameContext);
    }

    public void invokeSingleInputControllers(GameContainer gameContainer, SnakeGameContext snakeGameContext) {
        singleInputHandlers.forEach(ic -> ic.handleInputEvent(gameContainer, snakeGameContext));
    }

    public void invokeAllInputControllers(GameContainer gameContainer, SnakeGameContext snakeGameContext) {
        allInputHandlers.forEach(ic -> ic.handleInputEvent(gameContainer, snakeGameContext));
    }
}
