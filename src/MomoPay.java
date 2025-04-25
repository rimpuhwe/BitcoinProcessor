public class MomoPay {
    private  final int phoneNumber ;
    MomoPay(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Payment goes to " + phoneNumber;
    }
}
