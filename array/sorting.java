


import java.util.Scanner;

public class sorting {
	
	public static void printSortedArray(int[] arr){
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
					 if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				//System.out.println(arr[temp]);
			}
				 }
		}
		System.out.println("Sorted Array:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the index");
		int x=scan.nextInt();
		int[] arr=new int[x];
		System.out.println("Enter the Array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
	
		
		printSortedArray(arr);
		
	}

}
