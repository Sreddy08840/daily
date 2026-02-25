import java.util.Scanner;
class Factor{
	
	public static int factormethod(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=factormethod(n);
		System.out.println(res);
		
		
	
}
}	