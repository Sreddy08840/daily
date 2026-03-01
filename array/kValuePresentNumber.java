import java.util.Scanner;

public class kValuePresentNumber {
	
	static int countkValues(int[] a){
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the k value:");
		int k=scan.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				count++;
			}
			
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number of Index");
	int index=scan.nextInt();
	int[] a=new int[index];
	for(int i=0;i<a.length;i++) {
		a[i]=scan.nextInt();
	}
	int res=countkValues(a);
	System.out.println(res);
	}

}