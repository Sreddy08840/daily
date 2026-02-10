public class SecondLargestSmallest{
	public static void main(String[] args){
		int[] arr={10, 25, 5, 40, 20, 15};
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if (arr[i]>arr[j]){
					int temp=arr[i];
					arr[i] =arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("Sorted Array:  ");
		for (int num:arr){
		    System.out.print(num+" ");
		}
		int secondSmallest=arr[1];
		int secondLargest=arr[arr.length-2];
		
		System.out.println("\nSecond Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
		