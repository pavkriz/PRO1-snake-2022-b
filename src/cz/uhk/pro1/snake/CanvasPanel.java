package cz.uhk.pro1.snake;

import cz.uhk.pro1.snake.model.GameBoard;

import javax.swing.*;
import java.awt.*;

public class CanvasPanel extends JPanel {
    private GameBoard gameBoard;

    public CanvasPanel(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        gameBoard.draw(g);
    }
}
