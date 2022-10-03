import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MyFrame implements ActionListener {
    
    JButton button;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JCheckBox checkBox = new JCheckBox();

        button = new JButton("Submit");

        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font(null, Font.PLAIN, 25));        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setLayout(new FlowLayout());

        frame.add(checkBox);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
