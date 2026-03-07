import java.util.Scanner;

public class subarray {
	
	public static void subArray(int[]ar,int k){
		for(int i=0;i<=ar.length-k;i++) {
			for(int j=i;j<i+k;j++) {
				System.out.print(ar[j]+" ");
			}
			System.out.println();
		}
	}
		public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		int k=scan.nextInt();
		
		subArray(ar,k);
		}

}