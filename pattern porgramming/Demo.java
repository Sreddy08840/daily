import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
	}
}