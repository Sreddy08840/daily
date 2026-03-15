import java.util.Scanner;

public class allsubArray {
	 public static void findallsubArray(String s){
		 for(int size=1;size<=s.length();size++) {
		for(int i=0;i<=s.length()-size;i++) {
			String t="";
			for(int j=i;j<i+size;j++) {
				t += s.charAt(j);
			}
			System.out.println(t);
		}
		 }
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		
		
		findallsubArray(s);
		
	}

}