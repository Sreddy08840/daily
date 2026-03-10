import java.util.Scanner;

public class factorial {
	
	
	
	 public static int fac(int n) {
		 int res=1;
		 for(int i=1;i<=n;i++) {
			 res = res*i;
		 }
		 return res;
	 }
	 
	 
	 
	 
	 
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
	int res= fac(n);
	System.out.println(res);
 }
}
