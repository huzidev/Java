import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel text;
    MyFrame() {
        ImageIcon image = new ImageIcon("linux.png");
        ImageIcon imageA = new ImageIcon("linuxx.jpg");
        button = new JButton();
        text = new JLabel();

        // boundary for buttons
        button.setBounds(100, 100, 550, 300);

        // e -> is called lambda expression
        // button.addActionListener(e -> System.out.println("Button Clicked"));
        button.setText("Hello, World");

        // to get rid of unnecessary border after click on button
        button.setFocusable(false);

        // button.setIcon so Image will appear inside button
        button.setIcon(image);

        // for centered position of image and text
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);

        // font-size for button
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));

        // like margin
        button.setIconTextGap(-5);

        // to get rid of border on hover
        button.setBorder(BorderFactory.createEtchedBorder());

        // onClick button this component will be shown
        text.setIcon(imageA);
        text.setBounds(150, 250, 150, 150);
        
        // text will be shown when user clicked on the button
        text.setVisible(false);

        this.setTitle("HuziDev GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 720);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.add(button);
        this.add(text);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Button Clicked");
        }        
    }
}
