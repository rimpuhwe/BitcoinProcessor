public class PaymentProcessor {
    void processPayment(Bitcoin coin) throws InterruptedException {
        System.out.println("Processing Bitcoin payment...");
        Thread.sleep(1000);
        System.out.println(coin);
    }

    void processPayment(PayPal payPal) throws InterruptedException {
        System.out.println("Processing PayPal payment...");
        Thread.sleep(1000);
        System.out.println(payPal);
    }

    void processPayment(CreditCard creditCard)  {
        System.out.println("Processing Credit Card payment...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(creditCard);
    }

    void processPayment(MomoPay momoPay) {
        System.out.println("Processing Mobile Money (MomoPay) payment...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(momoPay);
    }
}

