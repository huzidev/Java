import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MyFrame implements ActionListener {

    MyFrame() {
        JFrame frame = new JFrame();
        JRadioButton pizza = new JRadioButton("pizza");
        JRadioButton burger = new JRadioButton("burger");
        JRadioButton pasta = new JRadioButton("pasta");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setLayout(new FlowLayout());

        frame.add(pizza);
        frame.add(burger);
        frame.add(pasta);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
