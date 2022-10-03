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
        // JOptionPane.showMessageDialog(null, "Are you sure?!", "Warning Message", JOptionPane.WARNING_MESSAGE);
        
        // Error message and you can use (while loop) with true statement to make it looks like a real virus
        // while (true) {
        //     JOptionPane.showMessageDialog(null, "Yours computer have a virus", "Virus", JOptionPane.ERROR_MESSAGE);
        // }


        // will asks Yes No and Cancel options
        // Yes will return 0 No will return 1 Cancel will return 2 and Cross will return -1
        // JOptionPane.showConfirmDialog(null, "Do you wanna delete this app", "Confirm message", JOptionPane.YES_NO_CANCEL_OPTION);


        JOptionPane.showInputDialog(null, "What is yours name?");
        
        // creating custom dialouge box
        String[] response = {
            "Yes, How many times do I've to Say",
            "Just NOOOOOO",
            "Don't show me this again you understand"
        };
        ImageIcon logo = new ImageIcon("linux.png");

        int answer = JOptionPane.showOptionDialog(
            null, 
            "So, What you say?", 
            "Custom message", 
            JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            logo, 
            response, 
            0
        );

        if (answer == 0) {
            System.out.println("Are You Sure?");
        } else if (answer == 1) {
            System.out.println("Nice Choice");
        } else if (answer == 2) {
            System.out.println("No problem");
        } else {
            System.out.println("Hey! Dude, Relax");
        }

    }
}