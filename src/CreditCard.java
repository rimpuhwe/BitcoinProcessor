import java.util.Scanner;

public class CreditCard {
    private final int id;
    CreditCard(Scanner card){
        System.out.print("Provide the credit card number: ");
        this.id = card.nextInt();
    }

    @Override
    public String toString() {
        return "Payment done with your Credit Card with ID No:" + id;
    }
}
