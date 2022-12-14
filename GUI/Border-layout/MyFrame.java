import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        // panels are like div
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        
        // SUB-PANELS
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setLayout(new BorderLayout(10, 10)); // adding margin inside BorderLayout
        frame.setVisible(true);

        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.BLUE);
        panel5.setBackground(Color.CYAN);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        frame.add(panel1, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.NORTH);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.SOUTH);

        // prepearing panel5 for SUB-PANELS
        panel1.setLayout(new BorderLayout(25, 25));

        panel6.setBackground(Color.LIGHT_GRAY);
        panel7.setBackground(Color.MAGENTA);
        panel8.setBackground(Color.ORANGE);
        panel9.setBackground(Color.GREEN);
        panel10.setBackground(Color.darkGray);
        
        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));
        
        // adding SUB-PANEL in a panel
        panel1.add(panel6, BorderLayout.CENTER);
        panel1.add(panel7, BorderLayout.NORTH);
        panel1.add(panel8, BorderLayout.WEST);
        panel1.add(panel9, BorderLayout.SOUTH);
        panel1.add(panel10, BorderLayout.EAST);
    }
}   
