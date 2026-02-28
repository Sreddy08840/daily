import java.util.Scanner;

public class sumOfArray {
	
	
	public static int printArray(int[] arr) {
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			 sum = sum+arr[i];	
		}
		return sum;
	}
	public static void main(String[] args) {
	Scanner  Sc= new Scanner(System.in);
	int n=Sc.nextInt();
	 int[] arr=new int[n];
	for (int i=0;i<arr.length;i++) {
		arr[i]=Sc.nextInt();
		
	}
	int res=printArray(arr);
	System.out.println(res);
	}	
	}
