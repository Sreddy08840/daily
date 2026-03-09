import java.util.Scanner;

public class rearenge1 {
	public static void zeroarearenge(int[] ar1){
		int i=0,j=0;
		while(i<ar1.length) {
		if(ar1[i]==0) {
			i++;
		}else {
			ar1[j]=ar1[i];
			i++;
			j++;
		}
		}
	
		while(j<ar1.length) {
			ar1[j] = 0;
			j++;
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		 int[] ar1= new int[n];
		 for(int i=0;i<ar1.length;i++) {
			 ar1[i]=scan.nextInt();
		 }
		 for(int i=0;i<ar1.length;i++) {
			 System.out.print(ar1[i]+" ");
		 }
		 System.out.println();
		 zeroarearenge(ar1);
		 for(int i=0;i<ar1.length;i++) {
			 System.out.print(ar1[i]+" ");
		 }
	}

}
