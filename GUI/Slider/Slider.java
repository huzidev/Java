import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Slider {

    JFrame frame;
    JPanel panel;
    JLabel text;
    JSlider slider;

    Slider() {
        frame = new JFrame("Java Slider");
        panel = new JPanel();
        text = new JLabel();

        // 0 is min, 100 is max and 50 is starting value
        slider = new JSlider(0, 100, 50);

        // width and height
        slider.setPreferredSize(new Dimension(500, 300));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);

        panel.add(slider);
        panel.add(text);
        frame.add(panel);
        frame.setVisible(true);
    }
}
