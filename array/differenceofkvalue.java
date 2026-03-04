import java.util.Scanner;

public class differenceofkvalue {
	
	public static void differenceequaltoK(int[] a,int k){
		for(int i=0;i<a.length-1;i++) {
			for(int j=1+i;j<a.length;j++) {
				if(a[i]-a[j]==k || a[j]-a[i]==k ) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the index of the array:");
		int n=scan.nextInt();
		int[] a=new int[n];
		for (int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("enter numbe r of k:");
		int k=scan.nextInt();
		
	differenceequaltoK(a,k);
		}
}