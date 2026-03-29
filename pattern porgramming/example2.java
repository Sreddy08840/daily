import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        int row = scan.nextInt();
        char ch = scan.next().charAt(0);

        scan.close();

        for (int i = 1; i <= count; i++) {

            // Main diagonal
            for (int r = 1; r <= row; r++) {
                for (int c = 1; c <= row; c++) {
                    if (c == r) {
                        System.out.print(ch + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            // Reverse diagonal
            for (int r = 1; r <= row; r++) {
                for (int c = 1; c <= row; c++) {
                    if (c == (row + 1 - r)) {
                        System.out.print(ch + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}