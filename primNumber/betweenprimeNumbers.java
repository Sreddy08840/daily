import java.util.Scanner;



public class betweenprimeNumbers {
	
	
	public static boolean  checkPrime(int n){
		int count =0;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
				
			}
		}
		return true;
		/*if(count==0) {
			System.out.println("this prime");
		}
		else {
			System.out.println("not prime");
		}*/
	}
		public static void betweenNumber(int a,int n) {
			for(int i=n;i<=a;i++) {
				if(checkPrime(i)){
					System.out.println(i);
				}
			}
		}
		
		
	
	public static void main(String[] args) {
	Scanner	sc=new Scanner(System.in);
	int a=sc.nextInt();
	int n=sc.nextInt();
	betweenNumber(a,n);
	
	}

}