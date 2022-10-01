import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener {
    // setting button as global so it can be used in actionPerfomed function
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

    // ActionListener for button and @Override public void... will be written automatically
    @Override
    public void actionPerformed(ActionEvent e) {
        // means if action performed is button
        if (e.getSource() == button) {
            System.out.println("Button clicked");
        }
    }
}
