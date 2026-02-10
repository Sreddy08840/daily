import java.util.Scanner;

public class votingage{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter voter age: ");
		int n=sc.nextInt();
		if(n<18){
			System.out.println("The voter is not eligble for voting");
		}else {
			System.out.println("The voter is elible for voting");
		}
		sc.close();
	}
}
