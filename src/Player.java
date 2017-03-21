/**
 * Created by martin on 3/20/17.
 */
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player{
    private int x, y;
    private boolean up = false, dn = false, lt = false, rt = false;
    private final int SPEED = 3;

    public Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static void drawPlayer(Graphics g) {
        int[] x = new int[]{230,250,270};
        int[] y = new int[]{670,645,670};
        g.setColor(Color.cyan);
        g.fillPolygon(x, y, x.length);
    }

    public void moveLeft () {
        x -= SPEED;
    }

    public void moveRight () {
        x += SPEED;
    }

    public void moveDown () {
        y += SPEED;
    }

    public void moveUp () {
        y -= SPEED;
    }

    /*
    // Select the correct part from the spritesheet
    public void render(Graphics g){
        g.drawImage(ss.crop(0 ,0, 16, 16), x, y, 16 * Game.SCALE, 16 * Game.SCALE, null);
    }
    */
}
