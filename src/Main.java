import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's proceed with the payment systems");
        Thread.sleep(2500);
        System.out.println("Want to proceed with:");
        System.out.println("""
                1.Bitcoin 
                2.Paypal
                3.Credit card
                4.Exit
                """);
    }
}
