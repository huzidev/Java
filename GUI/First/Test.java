import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Test {
    public static void main(String[] args) {
        JFrame frame =  new JFrame();
        JLabel text = new JLabel();
        ImageIcon icon = new ImageIcon("linux.png");

        // settting text for frame
        text.setText("Hello, World!");
        text.setForeground(Color.white);
        text.setIcon(icon);

        // setting frame
        frame.setTitle("HuziDev GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.black);
        frame.add(text);

        // setting Icon (Favicon)
        frame.setIconImage(icon.getImage());
    }
}