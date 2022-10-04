import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MyFrame {
    MyFrame() {
        JFrame frame = new JFrame();

        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        frame.setVisible(true);
    }
}
