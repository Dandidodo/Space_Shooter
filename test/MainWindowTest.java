import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by martin on 3/20/17.
 */
class MainWindowTest {
    @Test
    void addSuccess() {
        MainWindow mainWindow = new MainWindow();
        int a = 1;
        int b = 2;
        int result = mainWindow.add(a, b);

        int expected = 3;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void addFail() {
        MainWindow mainWindow = new MainWindow();
        int a = 1;
        int b = 2;
        int result = mainWindow.add(a, b);

        int expected = 2;
        Assertions.assertEquals(expected, result);
    }
}