import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Slider implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel text;
    JSlider slider;

    Slider() {
        frame = new JFrame("Java Slider");
        panel = new JPanel();
        text = new JLabel();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);

        // 0 is min, 100 is max and 50 is starting value
        slider = new JSlider(0, 100, 50);

        // width and height
        slider.setPreferredSize(new Dimension(500, 300));

        // PaintTicks small/minor ticks/lines after every 5 numbers
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);
        
        // setting bigger/major track/lines after every 25 numbers
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        // to show numbers on slider
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.ITALIC, 15));
        
        // setting slider position
        // slider.setOrientation(SwingConstants.HORIZONTAL);
        slider.setOrientation(SwingConstants.VERTICAL);

        // use ChangeListener instead of action listeer for slider
        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(text);
        frame.add(panel);
        frame.setVisible(true);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        text.setText("°C" + slider.getValue());
    }
}
