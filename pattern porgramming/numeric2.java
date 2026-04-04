import java.util.Scanner;

public class numeric2 {
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 int start=sc.nextInt();
		 int end = sc.nextInt();
		 
		 for (int number = start;number<=end;number++) {
			 if(isprime(number)) {
				 System.out.println(number);
			 }
		 }
	}
	static boolean isprime(int number){
		if(number<= 1){
			return false;
		}
		for(int i =2 ; i <= number/2 ;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
}
