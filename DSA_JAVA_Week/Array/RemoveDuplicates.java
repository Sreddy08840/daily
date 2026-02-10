public class RemoveDuplicates{
	public static void main(String[] args){
		int[] arr={10,10,20,20,30,30,40,50};
		int n=arr.length;
		
		if (n==1||n==0){
			System.out.println("Unquie Array: "+arr[0]);
			return ;
		}
		
		int j =0;
		for (int i=0;i<n-1;i++){
			if(arr[i] !=arr[i+1]){
				arr[j++]=arr[i];
			}
		}
		
		arr[j++]=arr[n-1];
		
		System.out.println("Array after removing duplicates:  ");
		for (int i=0;i<j;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
