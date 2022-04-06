package cz.uhk.pro1.snake.model;

import java.awt.*;
import java.util.Deque;
import java.util.LinkedList;

public class Snake {
    // TODO direction
    private Deque<SnakePiece> pieces = new LinkedList<>();
    private Direction direction;

    public Snake(int initialI, int initialJ, Direction initialDirection) {
        SnakePiece sp = new SnakePiece(initialI, initialJ);
        this.direction = initialDirection;
        //SnakePiece sp2 = new SnakePiece(4, 3);
        pieces.add(sp);
        //pieces.add(sp2);
    }

    public void draw(Graphics g) {
      for(SnakePiece p:pieces){
          p.draw(g);
      }
    }

    public void move() {
        int iHead = pieces.getFirst().getI();
        int jHead = pieces.getFirst().getJ();
        SnakePiece spNew = new SnakePiece(iHead+direction.getDi(), jHead+ direction.getDj());
        pieces.addFirst(spNew);
        pieces.removeLast();
    }

    public void moveAndEat() {
        int iHead = pieces.getFirst().getI();
        int jHead = pieces.getFirst().getJ();
        SnakePiece spNew = new SnakePiece(iHead+direction.getDi(), jHead+ direction.getDj());
        pieces.addFirst(spNew);
    }

    public Deque<SnakePiece> getPieces() {
        return pieces;
    }
}
