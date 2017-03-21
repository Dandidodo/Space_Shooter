import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by martin on 3/19/17.
 */
public class MainWindow implements KeyListener{
    public static final int WIDTH = 500, HEIGHT = 700;
    private JFrame frame;
    Player player;

    public void init() {
        this.frame = new JFrame("Space Shooter");
        frame.setContentPane(new MainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        //frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = frame.getSize().width;
        int h = frame.getSize().height;
        int gamePosX = (dim.width - w)/2;
        int gamePosY = (dim.height - h)/2;

        frame.setLocation(gamePosX, gamePosY);

        Player player = new Player(200, 600);

        frame.addKeyListener(this);
    }

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        //System.out.println("Key pressed code=" + e.getKeyCode() + ", char=" + e.getKeyChar());
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_LEFT:
                player.moveLeft();
            case KeyEvent.VK_RIGHT:
                player.moveRight();
            case KeyEvent.VK_DOWN:
                player.moveDown();
            case KeyEvent.VK_UP:
                player.moveUp();
        }

        frame.getContentPane().repaint();
    }

    public void keyReleased(KeyEvent e) {
    }
}

