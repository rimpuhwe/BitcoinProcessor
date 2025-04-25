import java.util.Scanner;

public class CreditCard {
    private int id;
    Scanner card = new Scanner(System.in);
    CreditCard(){
        System.out.print("Provide the credit card number");
        id = card.nextInt();
    }

    @Override
    public String toString() {
        return "Payment done with your Credit Card ";
    }
}
