
import java.util.Scanner;
public class largestIndex {
	
	static int findLargestIndex(int[] arr){
		int max=arr[0],index=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				index=i;
			}
			
		}
		return index;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("The Enter number of Index");
		int index=scan.nextInt();
		int[] arr=new int[index];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("The largest Number index of: "+findLargestIndex(arr));
	}

}