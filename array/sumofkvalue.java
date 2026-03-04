import java.util.Scanner;

public class sumofkvalue {
	
public static void sumkvalue(int[]arr,int k){
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]+arr[i]==k) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of the index:");
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the value of k");
		int k=scan.nextInt();
		
		sumkvalue(arr,k);
	}

}