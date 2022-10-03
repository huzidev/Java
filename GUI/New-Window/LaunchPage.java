import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.AncestorEvent;
import javax.swing.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("Open New Window");

    LaunchPage() {

        myButton.setBounds(100, 200, 200, 50);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }


}
