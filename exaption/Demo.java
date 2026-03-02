import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		try {
		Scanner scan=new Scanner(System.in);
		System.out.println("The Porgarm is Satrted");
		System.out.println("Enter number of numeator:");
		int a=scan.nextInt();
		System.out.println("Enter the dempntor: ");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
		
		System.out.println("Ente the inndex of the array :");
		int index=scan.nextInt();
		int[] arr =new int[index];
		System.out.println("Enter the data in array:");
		int data=scan.nextInt();
		System.out.println("Enter the the index number");
		int i=scan.nextInt();
		arr[i]=data;
		System.out.println("The data index "+ i +" :"+arr[i]);
		}
		catch(ArithmeticException a) {
			System.out.println("Enter the non-zero demonetor");
		}
		catch(NegativeArraySizeException b) {
			System.out.println("Enter the positive number of index");
		}
		catch(InputMismatchException c) {
			System.out.println("Enter the integer number:");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Enter theindex correctly");
		}
		catch(Exception d) {
			System.out.println("The input value in correct,please try again");
		}
	}

}