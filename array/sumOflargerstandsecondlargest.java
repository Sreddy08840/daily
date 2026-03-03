import java.util.Scanner;

public class sumOflargerstandsecondlargest {
	public static int findsumSecondLargestabdlargest(int[] arr){
		int Largest=0,secondLargest=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>Largest) {
				secondLargest=Largest;
				Largest=arr[i];
			}
			else if(arr[i]>secondLargest && Largest!= arr[i]) {
				secondLargest=arr[i];
			}
		}
		return secondLargest+Largest;
	}	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of index:");
		int n=scan.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		
		int res=findsumSecondLargestabdlargest(arr);
		System.out.println(res);
	}

}
