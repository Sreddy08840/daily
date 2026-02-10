import java.util.Arrays;

public class MergeArrays{
	static void mergeArrays(int[] arr1,int[] arr2){
		int n=arr1.length;
		int m=arr2.length;
		
		int[] mereged =new int [n+m];
		
		for(int i=0;i<n;++i){
			mereged[i]=arr1[i];
		}
		for(int j=0;j<m;++j){
			mereged[n+j]=arr2[j];
		}
		Arrays.sort(mereged);
		for(int i=0;i<n;i++){
			arr1[i]=mereged[i];
		}
		for(int j=0;j<m;++j){
		arr2[2]=mereged[n+j];
		}
	}
	public static void main(String[] args){
		int[] arr1={1,3,5,7};
		int[] arr2={2,4,6,8};
		
		mergeArrays(arr1,arr2);
		
		for(int num:arr1){
			System.out.print(num+" ");
		}
		System.out.println();
		for(int num:arr2){
			System.out.print(num+" ");
		}
		System.out.println();
	}
}


	