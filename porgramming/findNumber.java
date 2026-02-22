
import java.util.Scanner;
class findNumber{
	public static void main(String[] args ){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=10 && n<=99){
			System.out.println("This number is 2 digit number");
		}
		else{
			System.out.println("This is not a two digit number");
		}
		
		
	}
	}