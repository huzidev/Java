import java.awt.Font;
import javax.swing.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel text = new JLabel();

    NewWindow() {

        // x-axis, y-axis, width and height
        text.setBounds(250, 250, 100, 50);

        // null means defauly font
        text.setFont(new Font(null, Font.PLAIN, 30));

        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.add(text);
        frame.setVisible(true);
    }
}
