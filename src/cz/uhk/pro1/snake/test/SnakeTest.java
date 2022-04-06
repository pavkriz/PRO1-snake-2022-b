package cz.uhk.pro1.snake.test;

import cz.uhk.pro1.snake.model.Direction;
import cz.uhk.pro1.snake.model.Snake;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SnakeTest {
    @Test
    public void testMove() {
        Snake snake = new Snake(3,5, Direction.NORTH);
        snake.move();

        assertEquals(2, snake.getPieces().getFirst().getI());
        assertEquals(5, snake.getPieces().getFirst().getJ());
        assertEquals(1, snake.getPieces().size());
    }

    @Test
    public void testMoveAndEat() {
        Snake snake = new Snake(3,5, Direction.NORTH);
        snake.moveAndEat();

        // hlava
        assertEquals(2, snake.getPieces().getFirst().getI());
        assertEquals(5, snake.getPieces().getFirst().getJ());

        // ocas
        assertEquals(3, snake.getPieces().getLast().getI());
        assertEquals(5, snake.getPieces().getLast().getJ());

        assertEquals(2, snake.getPieces().size());

    }
}
