import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener {
    // setting button as global
    JButton button;
    MyFrame() {
        button = new JButton();
        // boundary for buttons
        button.setBounds(250, 100, 100, 50);

        this.setTitle("HuziDev GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 720);
        this.setVisible(true);
        this.setResizable(false);
        this.add(button);
    }

    // ActionListener for button and it'll be written automatically
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            
        }
    }
}
