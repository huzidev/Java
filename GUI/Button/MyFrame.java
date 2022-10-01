import javax.swing.JFrame;

import javax.swing.JFrame;
import javax.swing.JButton;

public class MyFrame extends JFrame {
    MyFrame() {
        JButton button = new JButton();

        this.setTitle("HuziDev GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 720);
        this.setVisible(true);
        this.setResizable(false);
    }
}
