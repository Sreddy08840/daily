import java.util.Scanner;

class exption{
		public void fly()throws Exception
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("The porgram is satrted");
		
		System.out.println("Enter the number of:");
		int a=scan.nextInt();
		System.out.println("enter the demonter:");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
	
	
}
		
		}	


public class throwback1 {
 public static void main(String[] args) {
	 exption ma=new exption();
	try {
	ma.fly();
	}
	catch(Exception e) {
		System.out.println("The expersion halben by thismain class");
	}
	 
	 
 }
}