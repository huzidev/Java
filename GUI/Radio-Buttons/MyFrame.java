import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MyFrame {

    MyFrame() {
        JFrame frame = new JFrame();
        JRadioButton pizza = new JRadioButton();
        JRadioButton burger = new JRadioButton();
        JRadioButton pasta = new JRadioButton();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setVisible(true);
        
    }
}
