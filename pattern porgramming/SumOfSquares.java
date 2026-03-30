import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // input
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                continue; // skip multiples of 4
            }
            sum += i * i; // add square
        }

        System.out.println("Sum of Squares: " + sum);
    }
}