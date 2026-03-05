import java.util.Scanner;

public class twoarryrepeated {
	public static void commonNumber(int[]ar1,int[]ar2){
		int i=0,j=0;
		while(i<ar1.length && j<ar2.length) {
			if(ar1[i]==ar2[j]) {
				System.out.println(ar1[i]);
				j++;
				i++;
			}
			else if(ar1[i]>ar2[j]){
				j++;
			}
			else {
				i++;
			}
		}
		
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
	    for(int j=0;j<ar2.length;j++) {
	    	ar2[j]=scan.nextInt();
	    }
	    commonNumber(ar1,ar2);
		
	}

}
