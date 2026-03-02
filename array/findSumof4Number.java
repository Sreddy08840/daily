import java.util.Scanner;

public class findSumof4Number {
	static int calculteSum(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum =sum+ a[i];
		}
		return sum;
	}
	static int findMxNumber(int[] a){
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	static int findMinNumber(int[] a){
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
		
	}
	
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the index of the Array:");
		int n=scan.nextInt();
		int[] a=new int[n];
		System.out.println("Enter thr data index the index");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
	}
		int sum=calculteSum(a);
		int max=findMxNumber(a);
		int min=findMinNumber(a);
		System.out.println(sum-max);
		System.out.println(sum-min);
		
	}
}
