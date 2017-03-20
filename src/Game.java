/**
 * Created by martin on 3/19/17.
 */

public class Game {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        mainWindow.init();

        /*
        //Spritesheet stuff, might be useful later
        ImageLoader loader = new ImageLoader();
        BufferedImage spriteSheet = loader.load("./spritesheet.png");
        SpriteSheet ss = new SpriteSheet(spriteSheet);
        */


        int sum = mainWindow.add(1, 2);
        System.out.print(sum);
    }
}