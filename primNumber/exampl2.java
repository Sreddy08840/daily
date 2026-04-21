import java.util.Scanner;
class exampl2{
	
	public static String primeexample(int n){
		int count=0;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				return "this not prime number";
			}
			else{
				
			}
			}
			return "this  prime number";
		
	
		if(count==2){
			System.out.println( "this prime number");
		}
		else{
			System.out.println( "this not prime number");
		}
	}
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String res=primeexample(n);
		System.out.println(res);
		
		
	}
}
