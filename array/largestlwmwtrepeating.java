import java.util.Scanner;

public class largestlwmwtrepeating {
	
	public static int  findlargestlwmwtrepeating(int[] a){
		for(int i=a.length-2;i>=0;i--) {
			if(a[i]==a[i+1]) {
			return a[i];
			}
			
		}
		return 0;
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		int re=findlargestlwmwtrepeating(a);
		System.out.println(re);
	}	
}