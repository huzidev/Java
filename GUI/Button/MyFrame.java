import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MyFrame extends JFrame {
    MyFrame() {
        ImageIcon image = new ImageIcon("linux.png");
        JButton button = new JButton();
        
        // boundary for buttons
        button.setBounds(200, 100, 100, 50);

        // e -> is called lambda expression
        button.addActionListener(e -> System.out.println("Button Clicked"));
        button.setText("Hello, World");

        // to get rid of unnecessary border after click on button
        button.setFocusable(false);

        // button.setIcon so Image will appear inside button
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);

        this.setTitle("HuziDev GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 720);
        this.setVisible(true);
        this.setResizable(false);
        this.add(button);
    }
}
