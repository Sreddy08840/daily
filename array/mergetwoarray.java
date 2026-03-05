import java.util.Scanner;

public class mergetwoarray {
	static int[] mergearray(int[] ar1,int[] ar2){
		int i=0,j=0,k=0;
		int[] res=new int[ar1.length+ar2.length];
		while(i<ar1.length&&j<ar2.length) {
			if(ar1[i]<ar2[j]) {
				res[k]=ar1[i];
				k++;
				i++;
			}
			else {
				res[k]=ar2[j];
				k++;
				j++;
			}
		}
		while(i<ar1.length) {
			res[k]=ar1[i];
			k++;
			i++;
		}
		while(j<ar2.length) {
			res[k]=ar2[j];
			k++;
			j++;
		}
		return res;
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar1=new int[n];
	    for(int i=0;i<ar1.length;i++) {
	    	ar1[i]=scan.nextInt();
	    }
		int o=scan.nextInt();
		int[] ar2=new int[o];
	    for(int i=0;i<ar2.length;i++) {
	    	ar2[i]=scan.nextInt();
	    }
	    int[] result =mergearray(ar1,ar2);
	    
	    for (int i = 0; i < result.length; i++){
			System.out.print(result[i]+" ");
		}
	}

}