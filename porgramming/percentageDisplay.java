import java.util.Scanner;
class percentageDisplay{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the percentage of student");
		int n=sc.nextInt();
		if (n>100 || n<0){
			System.out.println("the invalid number ");
		}
		else if(n>=91){
			System.out.println("A+");
		}
		else if(n>=81){
			System.out.println("A");
		}
		else if(n>=71){
			System.out.println("B+");
		}
		else if(n>=61){
			System.out.println("B");
		}
		else if(n>=51){
			System.out.println("c+");
		}
		else if(n>=41){
			System.out.println("c");
		}
		else if(n>=35){
			System.out.println("D");
		}
		else{
			System.out.println("Fail");
		}
	}
}

		
			
		