import java.util.Scanner;

public class findLargestNumber {
	
	static int theLargestNumber(int[] arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the index of the Array:");
		int index=scan.nextInt();
		int[] arr=new int[index];
		for(int i=0;i<arr.length;i++) {
			//4System.out.println("Enter the data in th array:");
			arr[i]=scan.nextInt();
			//System.out.print(arr[i]+" ");
		}
		int res=theLargestNumber(arr);
		System.out.println(res);
	}

}
