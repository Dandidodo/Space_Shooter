import oracle.jrockit.jfr.JFR;

import javax.swing.*;

/**
 * Created by martin on 3/19/17.
 */
public class MainWindow {
    private JPanel mainPanel;

    public void init() {
        JFrame frame = new JFrame("Space Shooter");
        frame.setContentPane(new MainWindow().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
