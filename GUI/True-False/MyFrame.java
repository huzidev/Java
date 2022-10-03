import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MyFrame implements ActionListener {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JCheckBox checkBox = new JCheckBox();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        frame.add(checkBox);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
