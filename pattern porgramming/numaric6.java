import java.util.Scanner;
public class numaric6 {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        
	        int fact = 1;

	        for(int i = 1; i <= n; i++) {
	            fact = fact * i;   // correct formula
	        }

	        System.out.println("Factorial of " + n + " is " + fact);
	    }
	}
