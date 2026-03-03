import java.util.Scanner;

public class secondSmallest {
	static int findSecondSmallest(int[] a){
		int smallest=Integer.MAX_VALUE,secondssmall=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				secondssmall=smallest;
				smallest=a[i];
			}
			else if(a[i]<secondssmall) {
				secondssmall=a[i];
			}
		}
		return secondssmall;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the index of the array");
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		int res=findSecondSmallest(a);
		System.out.println(res);
	}
	
	

}