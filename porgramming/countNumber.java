import java.util.Scanner;

public class countNumber {
	
	static int findcountNumber(int n){
	  int count=0;
	  while(n>0) {
		  n=n/10;
		  count++;
	  }
	  return count;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int res=findcountNumber(n);
		System.out.println(findcountNumber(n));
	}

}