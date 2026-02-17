import java.text.*;
public class WithFormat {
    public static void main (String[] args) {
        DecimalFormat num = new DecimalFormat("000");
        System.out.println(num.format(6));
        System.out.println(num.format(18));
        System.out.println(num.format(124));
        System.out.println(num.format(6+18+124));

    }
}
