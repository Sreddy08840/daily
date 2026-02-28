import java.util.Scanner;

public class printArray {
	public static void main(String[] args) {
	Scanner  Sc= new Scanner(System.in);
	int n=Sc.nextInt();
	 int[] arr=new int[n];
	for (int i=0;i<arr.length;i++) {
		arr[i]=Sc.nextInt();
		
	}
	for (int i=0;i<arr.length;i++) {
		
		System.out.println(arr[i]);
	}
	}

}