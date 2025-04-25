public class PaymentProcessor<T> {
     void processPayment(Bitcoin coin) {
         coin = new Bitcoin();
         System.out.println(coin);

    }
    void processPayment(PayPal payPal) {
         payPal = new PayPal();
         System.out.println(payPal);

    }
    void ProcessPayment(CreditCard creditCard) {
         creditCard = new CreditCard();
        System.out.println(creditCard);

    }
    void ProcessPayment(MomoPay momoPay) {
         momoPay = new MomoPay();
         System.out.println(momoPay);
    }

}
