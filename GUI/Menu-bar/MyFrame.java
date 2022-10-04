import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MyFrame implements ActionListener {
    MyFrame() {
        JFrame frame = new JFrame();

        // for menu-bar
        JMenuBar menuBar = new JMenuBar();

        // for items of menu-bar
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        JMenuItem LoadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem Exititem = new JMenuItem("Edit");

        file.add(LoadItem);
        file.add(saveItem);
        file.add(Exititem);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
         
        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
