import java.util.Scanner;

public class exam {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Connection Establishmate");
		try {
		System.out.println("Enter value of a");
		int a=scan.nextInt();
		System.out.println("Enter the value of b:");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Connection terminated");
		
	}

}