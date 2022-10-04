import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MyFrame implements ActionListener {
    JMenuItem LoadItem;
    JMenuItem saveItem;
    JMenuItem Exititem;
    MyFrame() {
        JFrame frame = new JFrame();
        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // for menu-bar
        JMenuBar menuBar = new JMenuBar();

        // for items of menu-bar
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        // sub-items of items of menu-bar
        LoadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        Exititem = new JMenuItem("Edit");

        LoadItem.addActionListener(this);
        saveItem.addActionListener(this);
        Exititem.addActionListener(this);

        file.add(LoadItem);
        file.add(saveItem);
        file.add(Exititem);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == LoadItem) {
            System.out.println("");
        }
    }
}
