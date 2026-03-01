import java.util.Scanner;

	public class Main1 {
	public static void main(String[] args) {
		System.out.println("The porgram is satrted");
		try {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the a c value");
		int a=scan.nextInt();
		System.out.println("Enter the b value");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Enterd the correct value:");
		}
		System.out.println("The porgarm is terminted ");
	}
}
