import java.util.Scanner;

public class pattern2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		pattern(n);
	}
	static void pattern(int n) {
		for (int i = n ;i >0;i--) {
			
			for(int j =1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}