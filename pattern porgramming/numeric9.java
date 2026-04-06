import java.util.Scanner;

public class numeric9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit = 0;

        while (number != 0) {
            int last = number % 10;   // get last digit
            digit += last;            // add to sum
            number = number / 10;     // remove last digit
        }

        System.out.println("Sum of digits: " + digit);
        scanner.close();
    }
}