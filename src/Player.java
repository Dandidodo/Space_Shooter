/**
 * Created by martin on 3/20/17.
 */
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player implements KeyListener{

    private int x, y;
    private SpriteSheet ss;
    private boolean up = false, dn = false, lt = false, rt = false;
    private final int SPEED = 3;

    public Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void tick(){
        if(up){
            y -= SPEED;
        }
        if(dn){
            y += SPEED;
        }
        if(lt){
            x -= SPEED;
        }
        if(rt){
            x += SPEED;
        }
    }

    /*
    // Select the correct part from the spritesheet
    public void render(Graphics g){
        g.drawImage(ss.crop(0 ,0, 16, 16), x, y, 16 * Game.SCALE, 16 * Game.SCALE, null);
    }
    */

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
}
