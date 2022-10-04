import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MyFrame implements ActionListener {

    JRadioButton pizza;
    JRadioButton burger;
    JRadioButton pasta;

    MyFrame() {
        JFrame frame = new JFrame();
        pizza = new JRadioButton("pizza");
        burger = new JRadioButton("burger");
        pasta = new JRadioButton("pasta");

        pizza.addActionListener(this);
        burger.addActionListener(this);
        pasta.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setLayout(new FlowLayout());

        // so user can only select any one radio button
        ButtonGroup group = new ButtonGroup();
        group.add(pizza);
        group.add(burger);
        group.add(pasta);

        frame.add(pizza);
        frame.add(burger);
        frame.add(pasta);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizza) {
            System.out.println("You've ordered a pizza");
        } else if (e.getSource() == burger) {
            System.out.println("You've ordered a burger");
        } else {
            System.out.println("You've ordered a pasta");
        }
    }
}
