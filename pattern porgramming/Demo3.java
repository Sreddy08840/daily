import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
				count=count+i;
			}
		System.out.println(count);
	}

}