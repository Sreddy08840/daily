

import java.util.HashSet;
import java.util.Scanner;

public class example1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int[] ar =new int[n];
		
		for(int i=0;i<ar.length;i++) {
		ar[i]=scan.nextInt();	
		}
		HashSet<Integer> lh=new HashSet<Integer>();
		for (int x : ar) {
			lh.add(x);
		}
		for (int x : lh) {
			System.out.println(x);
		}
	}

}