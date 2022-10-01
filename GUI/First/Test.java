import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class Test {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("linux.png");
        JFrame frame =  new JFrame();
        JLabel text = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.white, 3);

        // settting text for frame
        text.setText("Hello, World!");
        text.setForeground(Color.white);
        text.setHorizontalTextPosition(JLabel.CENTER);
        text.setVerticalTextPosition(JLabel.TOP);
        text.setFont(new Font("MV Boli", Font.ITALIC, 50));
        text.setIconTextGap(10); // like margin
        text.setBorder(border);
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setVerticalAlignment(JLabel.CENTER);
        
        // adding image in frame
        text.setIcon(icon);

        // setting frame
        frame.setTitle("HuziDev GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.black); // for RGB color use (new Color(0x000000))

        // for enabling adding text
        frame.add(text);

        // setting Icon (Favicon)
        frame.setIconImage(icon.getImage());
    }
}