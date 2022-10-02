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

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setVisible(true);
    }
}
