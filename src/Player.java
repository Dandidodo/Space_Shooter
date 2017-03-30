/**
 * Created by martin on 3/20/17.
 */
import java.awt.*;

public class Player{
    private int x, y;
    private boolean up = false, dn = false, lt = false, rt = false;
    private final int SPEED = 3;

    public Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void drawPlayer(Graphics g) {
        //System.out.print("\nx_dp:" + x);
        int[] x_cords = new int[]{x - 20, x, x + 20};
        int[] y_cords = new int[]{y + 25, y, y + 25};
        g.setColor(Color.cyan);
        g.fillPolygon(x_cords, y_cords, x_cords.length);
    }

    public void moveLeft () {
        //System.out.print("\nx_ml_b:" + x);
        x -= SPEED;
        //System.out.print("\nx_ml_a: " + x);
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
