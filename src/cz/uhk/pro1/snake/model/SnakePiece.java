package cz.uhk.pro1.snake.model;

import java.awt.*;

public class SnakePiece {
    private final int i;
    private final int j;

    public SnakePiece(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(j*20, i*20, 20, 20);
        g.setColor(new Color(0, 100, 0));
        g.drawRect(j*20, i*20, 20, 20);
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
