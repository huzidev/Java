import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener {
    MyFrame() {
        JButton button = new JButton();
        button.setBounds(250, 100, 100, 50);

        this.setTitle("HuziDev GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 720);
        this.setVisible(true);
        this.setResizable(false);
        this.add(button);
    }
}
