import java.util.Scanner;
class example1{
	
	public static void primeexample(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
	
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
		primeexample(n);
		
		
	}
}

	