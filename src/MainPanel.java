import javax.swing.*;
import java.awt.*;

/**
 * Created by martin on 3/20/17.
 */
class MainPanel extends JPanel {
    Player player;

    public MainPanel(Player player) {
        this.player = player;
        setBackground(Color.black);
    }

    public Dimension getPreferredSize() {
        return new Dimension(250,200);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the player's ship, a rectangle
        player.drawPlayer(g);

        // Draw Text
        //g.drawString("This is my custom Panel!",10,20);
    }
}

