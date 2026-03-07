import java.util.Scanner;

public class mergearray {
	
	public static int[] meragArray(int[] ar1,int[] ar2,int[] ar3){
		int k=0;
		int[] res=new int[ar1.length+ar2.length+ar3.length];
		for(int i =0;i<res.length;i++) {
			if(i<ar1.length) {
				res[k++]=ar1[i];	
			}
			if(i<ar2.length) {
				res[k++]=ar2[i];
			}
			if(i<ar3.length) {
				res[k++]=ar3[i];
			}
			
		}
		return res;
	}
	
	
	
	
	
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in) ;
		
		
		System.out.println("Enter the index of the first array:");
		int n1=scan.nextInt();
		int[] ar1=new int[n1];
		for(int i=0;i<ar1.length;i++) {
			ar1[i]=scan.nextInt();
		}
		
		System.out.println("Enter the index of the second array:");
		int n2=scan.nextInt();
		int[] ar2=new int[n2];
		for(int i=0;i<ar2.length;i++) {
			ar2[i]=scan.nextInt();
		}
		
		System.out.println("Enter the index of the third array:");
		int n3=scan.nextInt();
		int[] ar3=new int[n3];
		for(int i=0;i<ar3.length;i++) {
			ar3[i]=scan.nextInt();
		}
		int[] res=meragArray(ar1,ar2,ar3);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}

}
