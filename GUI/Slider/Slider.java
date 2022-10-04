import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Slider {

    JFrame frame;
    JPanel panel;
    JLabel text;
    JSlider slider;

    Slider() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);

        panel.add(slider);
        panel.add(text);
        frame.add(panel);
        frame.setVisible(true);
        
    }
}
