import java.util.Scanner;

public class countunquie1 {
	public static void findcountunquie(int[] a){
		int count=1;
		int unquiecount=0;
		for(int i=0;i<a.length-1;i++) {
			
				if(a[i]==a[i+1]) {
					count++;
				}
				else {
					if(count==1) {
					unquiecount++;
					
				}
					count=1;
				}
			}
		if(count==1) {
		 unquiecount++;
		}
		System.out.println(unquiecount);
			
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		findcountunquie(a);
	}
}
