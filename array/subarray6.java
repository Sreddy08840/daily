import java.util.Scanner;

public class subarray6 {
	
	public static void subArray(int[]ar,int k){
		for(int i=0;i<=ar.length;i++) {
			int sum=0;
			for(int j=i;j<ar.length;j++) {
				sum=sum+ar[j];
				
			
			 if(sum == 6) {
	                for(int x = i; x <= j; x++) {
	                    System.out.print(ar[x] + " ");
	                }
	               System.out.println();
	            }
			
		}
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
