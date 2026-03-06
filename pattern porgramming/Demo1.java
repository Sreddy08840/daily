import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				count++;
			}
			System.out.println(" ");
			
		}
		System.out.println(count);
	}

}
