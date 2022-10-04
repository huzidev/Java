import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    
    // buttons for numbers 0 to 9
    JButton[] numberButtons = new JButton[10];
    JButton[] funcButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;

    double num1 = 0, num2 = 0, result = 0;
    
    // for holding multiply, divide etc
    char operator;

    Calculator() {
        frame = new JFrame("Java Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        frame.setVisible(true);
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}