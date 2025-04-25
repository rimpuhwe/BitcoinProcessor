import java.util.Scanner;

public class MomoPay {
    private  final int phoneNumber ;
    MomoPay(Scanner phone) {
        System.out.print("Enter Phone Number: ");
        this.phoneNumber = phone.nextInt();
    }

    @Override
    public String toString() {
        return "Payment goes to " + phoneNumber;
    }
}
