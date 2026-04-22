import java.util.Scanner;

public class ispallidermstring {
	
	public static void findthePAlideram(String s,int size){
		
		for(int i=0;i<=s.length()-size;i++) {
			String t="";
			for(int j=i;j<size+i;j++) {
				t += s.charAt(j);
			}
			if(ispalideram(t)) {
			System.out.println(t);
			}
		}
		
		
	}
	public static boolean ispalideram(String m){
		int i=0;
		int j=m.length()-1;
		while(i<j) {
			if(m.charAt(i)==m.charAt(j)) {
				i++;
				j--;
				
			}
			else {
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int size=scan.nextInt();
		
		findthePAlideram(s,size);
		//System.out.println(res);
	}

}