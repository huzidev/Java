import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Test {
    public static void main(String[] args) {
        JFrame frame =  new JFrame();
        JLabel text = new JLabel();

        // settting text for frame
        text.setText("Hello");

        // setting frame
        frame.setTitle("HuziDev GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1080, 720);
        frame.setVisible(true);

        // setting Icon (Favicon)
        ImageIcon icon = new ImageIcon("linux.png");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(Color.black);
    }
}