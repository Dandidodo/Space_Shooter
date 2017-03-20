import javax.swing.*;
import java.awt.*;

/**
 * Created by martin on 3/19/17.
 */
public class MainWindow {
    public static final int WIDTH = 500, HEIGHT = 700, SCALE = 1;

    public void init() {
        JFrame frame = new JFrame("Space Shooter");
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
    }

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

