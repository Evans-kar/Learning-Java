import javax.swing.*;

public class CalculatePerimeter {
    public static void main(String[] args) {
        int length = 18;
        int width = 16;
        int perimeter = 2 * (length + width);
        JOptionPane.showMessageDialog(null, "The perimeter is " + perimeter);
    }
}
