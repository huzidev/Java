import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;

public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        
        // FlowLayout.CENTER will put the child in center
        // FlowLayout.LEADING will put the child in start (extreme left)
        // FlowLayout.TRAILING will put the child in end (extreme right)
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // margin and padding
        
        // setting panel (Div)
        panel.setPreferredSize(new Dimension(500, 700));
        panel.setBackground(Color.BLACK);
        panel.setLayout(new FlowLayout());
        
        // inseting button inside panel
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));
        
        frame.add(panel);

        // Put frame.setVisible(true) here because sometimes we'll get error therefore to put visibility true at the very end like we put javascript file at the end of HTML file
        frame.setVisible(true);
    }
}
