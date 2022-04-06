package cz.uhk.pro1.snake;

import cz.uhk.pro1.snake.model.GameBoard;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class MainWindow extends JFrame {
    private final Timer timer = new Timer(500, e -> tick());    // casovac, ktery spousti metodu tick kazdych 500ms
    private final GameBoard gameBoard = new GameBoard(); // presunuto z kostruktoru sem, mj. aby byla promenna gameBoard viditelna v tick()
    private final CanvasPanel p = new CanvasPanel(gameBoard);

    public MainWindow() {
        setTitle("Snake");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p.setDoubleBuffered(true); // zapneme potencialne plynulejsi animace
        add(p);
        p.setPreferredSize(new Dimension(300, 300));
        pack();
        timer.start();  // zapneme casovac
    }

    public void tick() {
        System.out.println(new Date()+" tick!");
        // TODO volitelne (extra bod): zkontrolovat, zda hrac pohybem vpred nevyjede z herni plochy ( jeji rozmer si muzete si definovat pevne napr. 20x20)
        // TODO povinne: posunout hada o 1 krok

        // vyvolame prekresleni herni plochy na JPanelu (CanvasPanelu):
        p.repaint();
        // kvuli lagovani v Linuxu: Synchronizes this toolkit's graphics state. Some window systems may do buffering
        // of graphics events. This method ensures that the display is up-to-date. It is useful for animation.
        Toolkit.getDefaultToolkit().sync();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainWindow w = new MainWindow();
            w.setVisible(true);
        });
    }
}
