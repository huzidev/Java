import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MyFrame {

    MyPanel panel;

    MyFrame() {
        JFrame frame = new JFrame();
        panel = new MyPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);

        frame.add(panel);
        frame.setVisible(true);
    }
}
