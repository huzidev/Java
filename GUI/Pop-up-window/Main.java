import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // this is plain messgae without any ICON
        // JOptionPane.showMessageDialog(null, "Hello, World!", "Simple Message", JOptionPane.PLAIN_MESSAGE);
        
        // informative message with Inforamtion ICON
        // JOptionPane.showMessageDialog(null, "You are learning basics of Java", "Learning", JOptionPane.INFORMATION_MESSAGE);
        
        // Question message
        // JOptionPane.showMessageDialog(null, "How Are You?", "Question", JOptionPane.QUESTION_MESSAGE);
        
        // Warning message
        // JOptionPane.showMessageDialog(null, "Are you sure?!", "Simple Message", JOptionPane.WARNING_MESSAGE);
        
        // Error message and you can use (while loop) with true statement to make it looks like a real virus
        // while (true) {
        //     JOptionPane.showMessageDialog(null, "Yours computer have a virus", "Virus", JOptionPane.ERROR_MESSAGE);
        // }


        // will asks Yes No and Cancel options
        // Yes will return 0 No will return 1 Cancel will return 2 and Cross will return -1
        int answer = JOptionPane.showConfirmDialog(null, "Do you wanna delete this app", "Confirm message", JOptionPane.YES_NO_CANCEL_OPTION);

        if (answer == 0) {
            System.out.println("Are You Sure?");
        } else if (answer == 1) {
            System.out.println("Nice Choice");
        } else if (answer == 2) {
            System.out.println("No problem");
        } else {
            System.out.println("Hey! Dude, Relax");
        }
        

        // creating custom dialouge box
    }
}