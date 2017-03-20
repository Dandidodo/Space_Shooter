/**
 * Created by martin on 3/19/17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Test!");

        MainWindow mainWindow = new MainWindow();
        mainWindow.init();
        int sum = mainWindow.add(1, 2);
        System.out.print(sum);
    }
}