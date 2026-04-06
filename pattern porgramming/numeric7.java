import java.util.Scanner;
public class numeric7 {
	

	
	public static void main(String[] args) {
	// Use Scanner to take user input
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();

	// Find and print the n-th term of the series
	int nth= 1;
	nth = n*(n+1)/2;
	System.out.println("The "+n+"th term of the series is "+ nth+".");

	}
}
