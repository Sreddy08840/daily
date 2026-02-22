import java.util.Scanner;

class findLastdigit{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		if(n%100==53){
			System.out.println("The last digit is 53");
		}
		else{
			System.out.println("The last digit is not a 53");
		}
	}
}

		