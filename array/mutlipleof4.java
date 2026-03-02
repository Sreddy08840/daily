import java.util.Scanner;

public class mutlipleof4 {
	
	static int multiple(int[] a){
		int mul=1;
		for(int i=0;i<a.length;i++) {
			mul =mul*a[i];
		   
		}
		return mul;
	}
	static int[] poruct(int[] a,int porb){
		int[] res =new int[a.length];
		for(int i=0;i<a.length;i++) {
			res[i] =porb/a[i];
	}
		return res;
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
		int porb=multiple(a);
		int[] res=poruct(a,porb);
		for(int i=0;i<a.length;i++) {
			System.out.print(res[i]+" ");
		}
		
		
	}

}
