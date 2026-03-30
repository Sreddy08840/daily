import java.util.Scanner;

public class sorting {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			}
		sorting(arr);
	}
	static void sorting(int[] arr ) {
		
	int temp;
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0 ;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
				temp =arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
				
		}
			
	}
		for (int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
