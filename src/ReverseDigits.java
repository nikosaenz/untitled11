//demo
import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 999: ");
        int number = input.nextInt();

        if (number < 0 || number >= 1000) {
            System.out.println("The number must be between 0 and 999.");
            return;
        }

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;

        System.out.printf("%d%d%d\n", ones, tens, hundreds);
    }
}
