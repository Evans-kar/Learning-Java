public class TicketPrice {
    public static void main(String[] args) {
        int age = -4;
        //validation step
        if (age < 0) {
            System.out.println("Invalid age");
            return;
        }
        if (age < 5){
            System.out.println("Free");
        } else if (age <=12){
            System.out.println("Child: £5");
        } else if (age <=17) {
           System.out.println("Teen: £7");
        } else if (age <=64) {
            System.out.println("Adult: £10");
        }  else if (age >= 65) {
            System.out.println("Senior: £6");
        }
    }
}
