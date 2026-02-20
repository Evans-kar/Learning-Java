import javax.swing.*;

public class ShowDeclaration {
    public static void main(String[] args) {
        double grade1, grade2, total, average; //variable declaration
        //variable initialization
        grade1 = 85.5;
        grade2 = 98.0;
        total = grade1 + grade2;
        average = (grade1 + grade2) / 2;
        JOptionPane.showMessageDialog(null, "The average is " + average
        , "Output Display", JOptionPane.INFORMATION_MESSAGE);


    }
}
