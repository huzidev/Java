import javax.swing.JFrame;
import javax.swing.JButton;

public class MyFrame extends JFrame {
    // setting button as global so it can be used in actionPerfomed function
    JButton button;
    MyFrame() {
        button = new JButton();
        // boundary for buttons
        button.setBounds(250, 100, 100, 50);
        button.addActionListener(e -> System.out.println("Button Clicked"));

        this.setTitle("HuziDev GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 720);
        this.setVisible(true);
        this.setResizable(false);
        this.add(button);
    }
}
