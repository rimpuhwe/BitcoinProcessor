import java.util.Scanner;

public class PayPal {
    private final String email;
    private final double amount;

    PayPal(Scanner scanner){
        System.out.print("Enter the recipient's email address: ");
        this.email = scanner.next();
        System.out.print("Enter the amount to pay: ");
        this.amount = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return "Paid $" + amount + " to " + email + " via PayPal.";
    }
}
