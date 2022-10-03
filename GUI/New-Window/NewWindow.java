import java.awt.*;
import javax.swing.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel text = new JLabel("Hello, World!");

    NewWindow() {
        // x-axis, y-axis, width and height
        text.setBounds(250, 250, 300, 50);

        // null means default font
        text.setFont(new Font(null, Font.PLAIN, 30));

        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.add(text);
        frame.setVisible(true);
    }
}