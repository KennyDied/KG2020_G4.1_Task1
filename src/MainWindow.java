import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() throws HeadlessException {
        DrowPanel dp = new DrowPanel();
        this.add(dp);
    }
}
