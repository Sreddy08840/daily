import java.util.Scanner;

public class conssubarraycountmax {
	public static  void longestconsecutivesubarray(int[] ar1){
		int max=0,count=1;
		for(int i=0;i<ar1.length-1;i++) {
			if(ar1[i+1]-ar1[i]==1) {
				count++;
			}
			else {
				if(max < count) {
					max=max+count;
				}
				count=1;
			}
		}
		if(max < count) {
			max=count;
		}
		System.out.println(max);
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar1=new int[n];
		for(int i=0;i<ar1.length;i++) {
			ar1[i]=scan.nextInt();
		}
		longestconsecutivesubarray(ar1);
	}
}