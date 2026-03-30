import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int count = scan.nextInt();
		char symbol = scan.next().charAt(0);
		
		for(int i =1 ;i <=count ;i++) {
			
			for(int r = 1;r<=n;r++) {
				for(int c= 1; c<=n;c++) {
					if(r == c) {
						System.out.print(symbol + " ");
					}
					else {
					System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			for(int r=1; r<=n;r++) {
				for(int c = 1; c<=n;c++) {
					if(c<=n+1-r) {
					if (c==n+1-r) {
						System.out.print(symbol + " ");
					}
					else {
						System.out.print(" ");
					}
					}
				}
				System.out.println();
			}
		}
		
	}
}