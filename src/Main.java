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
        int choice  = sc.nextInt();
        switch (choice) {
            case 1:{
                System.out.println("Your payment system is a Bitcoin payment system");
                break;
            }
            case 2:{
                System.out.println("Your payment system is a Paypal payment system");
               break;
            }
            case 3:{
                System.out.println("Your payment system is a Credit card payment system");
                break;
            }
            case 4:{
                System.out.println("Thank you for using our Payment System");
                break;
            }
            default:
                System.out.println("Invalid choice");
        }


    }
}
