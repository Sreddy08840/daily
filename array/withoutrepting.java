import java.util.Scanner;

public class withoutrepting {
	public static void findwithoutrepting(int[] a){
		
		for(int i=0;i<a.length-1;i++) {
			
				if(a[i]!=a[i+1]) {
					System.out.print(a[i]+" ");
				}
			}
		  System.out.println(a[a.length-1]);
			
		}
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
			
			
		}
		findwithoutrepting(a);
	}
}
