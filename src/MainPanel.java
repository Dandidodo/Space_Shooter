import javax.swing.*;
import java.awt.*;

/**
 * Created by martin on 3/20/17.
 */
class MainPanel extends JPanel {
    public MainPanel() {
        setBackground(Color.black);
    }

    public Dimension getPreferredSize() {
        return new Dimension(250,200);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the player's ship, a rectangle
        int[] x = new int[]{230,250,270};
        int[] y = new int[]{670,645,670};
        g.setColor(Color.cyan);
        g.fillPolygon(x, y, x.length);

        // Draw Text
        //g.drawString("This is my custom Panel!",10,20);
    }
}

