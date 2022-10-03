import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("Open New Window");

    LaunchPage() {

        myButton.setBounds(100, 200, 200, 50);
        myButton.setFocusable(false);

        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
