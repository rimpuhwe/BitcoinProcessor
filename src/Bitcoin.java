import java.util.Scanner;

public class Bitcoin {
    private final int amount;
    Bitcoin(Scanner mount) {
        this. amount = mount.nextInt();
    }

    @Override
    public String toString() {
        return "you paid "+ amount +" BTC";
    }
}
