import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	System.out.println("the porgarm is Stated");
	try {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Sizee od the Array:");
	int size=scan.nextInt();
	int[] arr=new int[size];
	System.out.println("the enter the Data:");
	int data=scan.nextInt();
	System.out.println("ENter the index of of the data:");
	int index=scan.nextInt();
	arr[index]=data;
	System.out.println(arr[index]);
	}
	catch(Exception e) {
		System.out.println("the enter the correct data");
	}
	System.out.println("the porgarm  is terminated:");	
	}
	
}
