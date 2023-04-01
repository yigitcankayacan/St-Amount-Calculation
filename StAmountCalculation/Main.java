import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int withStAmount;
        int stAmount;
        int amount;
        int stRate;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your amount= ");
        amount = scanner.nextInt();

        if (amount <= 500) {
            stRate = 18;
        } else if (amount > 500) {
            stRate = 8;
        } else {
            stRate = 0;
        }

        System.out.println("ST Rate= %" + stRate);

        stAmount = (amount * stRate) / 100;
        System.out.println("ST Amount= " + stAmount);

        withStAmount = (stAmount + amount);
        System.out.println("With ST Amount= " + withStAmount);
    }
}
