package cz.uhk.pro1.snake.model;

import java.awt.*;

public class GameBoard {

    private Snake snake = new Snake(3, 4, Direction.NORTH);

    public void draw(Graphics g) {
        snake.draw(g);
    }

}
