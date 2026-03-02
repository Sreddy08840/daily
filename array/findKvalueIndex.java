import java.util.Scanner;

public class findKvalueIndex {
	
	static int fndkIdex(int[] a,int k){
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {	
				return i;
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array of index:" );
		int n=scan.nextInt();
		int[] a=new int[n];
		System.out.println("enter data in the index");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Enter the k value:");
		int k=scan.nextInt();
		
		int res=fndkIdex(a,k);
		System.out.println(res);
	}
}
