import java.util.Scanner;

public class conssubarraycountmaxarray {
	public static  void longestconsecutivesubarrayshow(int[] ar1){
		int max=0,count=1,ei=0,si=0;
		for(int i=0;i<ar1.length-1;i++) {
			if(ar1[i+1]-ar1[i]==1) {
				count++;
			}
			else {
				if(max < count) {
					max=count;
					ei=i;
				}
				count=1;
			}
		}
		if(max < count) {
			max=count;
			ei=ar1.length-1;
		}
		si = ei-max+1;
		for(int i=si;i<=ei;i++) {
		System.out.print(ar1[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar1=new int[n];
		for(int i=0;i<ar1.length;i++) {
			ar1[i]=scan.nextInt();
		}
		longestconsecutivesubarrayshow(ar1);
	}

}

