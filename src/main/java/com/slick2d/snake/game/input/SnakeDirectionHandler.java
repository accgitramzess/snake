package com.slick2d.snake.game.input;

import com.slick2d.snake.game.context.SnakeGameContext;
import com.slick2d.snake.core.input.S2InputEventHandler;
import com.slick2d.snake.game.enums.SnakeDirection;

import com.slick2d.snake.game.object.snake.Snake;
import com.slick2d.snake.game.object.snake.SnakePart;
import com.slick2d.snake.game.slice.TurningSlice;
import com.slick2d.snake.game.slice.TurningSliceDirectionMapper;
import com.slick2d.snake.game.slice.TurningSliceFactory;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

/**
 * Created by LilG2pac on 29.05.2018.
 */
public class SnakeDirectionHandler implements S2InputEventHandler {

    private TurningSliceFactory turningSliceFactory;

    private TurningSliceDirectionMapper turningSliceDirectionMapper;

    public SnakeDirectionHandler(TurningSliceFactory turningSliceFactory,
                                 TurningSliceDirectionMapper turningSliceDirectionMapper) {
        this.turningSliceFactory = turningSliceFactory;
        this.turningSliceDirectionMapper = turningSliceDirectionMapper;
    }

    @Override
    public void handleInputEvent(GameContainer gameContainer, SnakeGameContext snakeGameContext) {
        Input input = gameContainer.getInput();
        if(input.isKeyDown(Input.KEY_LEFT)) {
            handleInputEvent(snakeGameContext, SnakeDirection.LEFT);
        } else if(input.isKeyDown(Input.KEY_DOWN)) {
            handleInputEvent(snakeGameContext, SnakeDirection.DOWN);
        } else if(input.isKeyDown(Input.KEY_RIGHT)) {
            handleInputEvent(snakeGameContext, SnakeDirection.RIGHT);
        } else if(input.isKeyDown(Input.KEY_UP)) {
            handleInputEvent(snakeGameContext, SnakeDirection.UP);
        }
    }

    private void handleInputEvent(SnakeGameContext snakeGameContext, SnakeDirection newSnakeDirection) {
        Snake snake = snakeGameContext.getSnake();
        SnakePart snakeHead = snake.getHead();
        TurningSlice turningSlice = turningSliceFactory.createTurningSlice(
                snakeHead.getX(),
                snakeHead.getY(),
                turningSliceDirectionMapper.map(snakeHead.getSnakeDirection()),
                turningSliceDirectionMapper.map(newSnakeDirection)
        );
        snake.addTurningSlice(turningSlice);
        snake.changeDirection(newSnakeDirection);
    }
}
