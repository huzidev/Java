import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// GRID-LAYOUT wil 3x3 means 3 columns and 3 rows
public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setLayout(new GridLayout(3, 3, 10, 10)); // 3rd and 4th are magin

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.setVisible(true);
    }
}
