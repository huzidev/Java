import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

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
        frame.setLayout(new Borderlayout());
        frame.setVisible(true);

        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.BLUE);
        panel5.setBackground(Color.WHITE);

        panel1.setPreferredSize(new Dimension(100, 100));
    }
}   
