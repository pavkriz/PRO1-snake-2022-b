package cz.uhk.pro1.snake.model;

public enum Direction {
    NORTH(-1, 0),
    SOUTH(1, 0),
    WEST(0, -1),
    EAST(0, 1);

    private final int di;
    private final int dj;

    Direction(int di, int dj) {
        this.di = di;
        this.dj = dj;
    }

    public int getDi() {
        return di;
    }

    public int getDj() {
        return dj;
    }
}
