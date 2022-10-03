import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MyFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    MyFrame() {
        JFrame frame = new JFrame();
        checkBox = new JCheckBox("I'm not a robot");

        button = new JButton("Submit");
        button.addActionListener(this);

        checkBox.setFocusable(false);
        checkBox.setFont(new Font(null, Font.PLAIN, 25));        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setLayout(new FlowLayout());

        frame.add(button);
        frame.add(checkBox);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // checkBox.isSelected() will return ture or false
            System.out.println(checkBox.isSelected());
        }
    }
}
