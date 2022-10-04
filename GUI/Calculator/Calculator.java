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

    // font
    Font myFont = new Font("null", Font.BOLD, 25);

    Calculator() {
        frame = new JFrame("Java Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        // setting text-field
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        
        // text-field only works when user clicks on button
        textField.setEditable(false);
        textField.setFont(myFont);

        // setting buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("DELETE");
        clrButton = new JButton("CLEAR");

        // adding buttons to function buttons
        funcButtons[0] = addButton;
        funcButtons[1] = subButton;
        funcButtons[2] = mulButton;
        funcButtons[3] = divButton;
        funcButtons[4] = decButton;
        funcButtons[5] = equButton;
        funcButtons[6] = delButton;
        funcButtons[7] = clrButton;

        frame.add(textField);
        frame.setVisible(true);
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}