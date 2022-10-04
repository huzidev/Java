import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MyFrame implements ActionListener {
    MyFrame() {
        JFrame frame = new JFrame();

        // for menu-bar
        JMenuBar menuBar = new JMenu();

        // for items of menu-bar
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
         
        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
