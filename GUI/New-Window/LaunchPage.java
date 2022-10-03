import java.awt.event.*;
import javax.swing.*;

public class LaunchPage implements ActionListener{

    JFrame frame = new JFrame();
    JButton myButton = new JButton("Open New Window");

    LaunchPage() {

        myButton.setBounds(100, 200, 200, 50);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.add(myButton);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        // after clicking on button the frame (window) with new button will be closed
        frame.dispose();

    }

}
