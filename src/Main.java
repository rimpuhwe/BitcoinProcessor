import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        System.out.println("Let's proceed with the payment system");
        Thread.sleep(2500);

        while (true) {
            System.out.println("Choose your payment method:");
            System.out.println("""
                1. Bitcoin 
                2. PayPal
                3. Credit Card
                4. Mobile Money (MomoPay)
                5. Exit
            """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Your payment system is Bitcoin.");
                    Bitcoin bitcoin = new Bitcoin(sc);
                    paymentProcessor.processPayment(bitcoin);
                }
                case 2 -> {
                    System.out.println("Your payment system is PayPal.");
                    PayPal payPalPayment = new PayPal(sc);
                    paymentProcessor.processPayment(payPalPayment);
                }
                case 3 -> {
                    System.out.println("Your payment system is Credit Card.");
                    CreditCard cardPayment = new CreditCard(sc);
                    paymentProcessor.processPayment(cardPayment);
                }
                case 4 -> {
                    System.out.println("Your payment system is Mobile Money (MomoPay).");
                    MomoPay momoPayment = new MomoPay(sc);
                    paymentProcessor.processPayment(momoPayment);
                }
                case 5 -> {
                    System.out.println("Thank you for using our Payment System. Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
