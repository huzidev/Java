import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        // panels are like div
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.BLUE);
        panel5.setBackground(Color.WHITE);

        // panel1.setPreferredSize(new Dimension(100, 100));
        // panel2.setPreferredSize(new Dimension(100, 100));
        // panel3.setPreferredSize(new Dimension(100, 100));
        // panel4.setPreferredSize(new Dimension(100, 100));
        // panel5.setPreferredSize(new Dimension(100, 100));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.NORTH);
        frame.add(panel3, BorderLayout.NORTH);
        frame.add(panel4, BorderLayout.NORTH);
        frame.add(panel5, BorderLayout.NORTH);
    }
}   
