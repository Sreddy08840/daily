import java.util.Scanner;

public class rearrenge {
	
	 public static void Rearengearraaay(int[] ar1){
		int i=ar1.length-1,j=ar1.length-1;
		while(i>=0) {
		if(ar1[i]==-1) {
			i--;
		}else {
		ar1[j]=ar1[i];
		i--;
		j--;
		}
		}
		while(j>=0) {
			ar1[j]=-1;
			j--;
			
		}
	}
	
	
	
	
	
	
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int[] ar1=new int[n];
	for(int i=0;i<ar1.length;i++) {
		ar1[i]=scan.nextInt();
	}
	for(int i=0;i<ar1.length;i++) {
		System.out.print(ar1[i]+" ");
	}
	System.out.println();
	Rearengearraaay(ar1);
	for(int i=0;i<ar1.length;i++) {
		System.out.print(ar1[i]+" ");
	}
}
}
