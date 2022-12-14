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

    // num1 starting value of calculator
    // num2 second value after clicking on function button
    // result is sum of both the values
    double num1 = 0, num2 = 0, result = 0;
    
    // for holding multiply, divide functions etc
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

        for(int i = 0; i < 8; i++) {
            funcButtons[i].addActionListener(this);
            funcButtons[i].setFocusable(false);
            funcButtons[i].setFont(myFont);
        }

        for(int i = 0; i < 10; i++) {
            // value of i will starts from 0 to 9
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setFont(myFont);
        }

        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);
        
        
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // this must have to be in SEQUENCE
        // starting for loop with 1 because we wanted to print number 1 then 2 then 3 then + sign therefore SEQUENCE must have to be followed
        for(int i = 1; i < 4; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(addButton);

        for(int i = 4; i < 7; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(subButton);

        for(int i = 7; i < 10; i++) {
            panel.add(numberButtons[i]);
        }
        
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        
        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 10; i++) {
            // means if user clicked on any button
            if (e.getSource() == numberButtons[i]) {
                // concat means links hene links whatever buttons is pressed to text-field
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decButton) {
            textField.setText(textField.getText().concat("."));
        }
        else if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            // after clicking on + the text-field will changes to EMPTY so user can enter new values
            textField.setText("");
        }
        else if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        else if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        else if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        else if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textField.getText());

            if (operator == '+') {
                result = num1 + num2;
            }
            else if (operator == '-') {
                result = num1 - num2;
            }
            else if (operator == '*') {
                result = num1 * num2;
            }
            else if (operator == '/') {
                result = num1 / num2;
            }

            // will print the value of result in text-field
            textField.setText(String.valueOf(result));
            
            // so user can use result value again
            num1 = result;
        }
        else if (e.getSource() == clrButton) {
            textField.setText("");
        }
        // for deleting last number at a time like using backspace
        else if (e.getSource() == delButton) {
            String string = textField.getText();
            textField.setText("");
            // using length - 1 for targeting last number
            for (int i = 0; i < string.length() - 1; i++) {
                textField.setText(textField.getText()+string.charAt(i));
            }
        }
    }
}