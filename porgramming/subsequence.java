import java.util.Scanner;

public class subsequence {
	public static String findsubsequence(String s,String t){
		int i=0,j=0;
		while(i<s.length()&&j<t.length()) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
				j++;
			}
			else {
			i++;
			}
		}
		return j==t.length() ? "yes" :"no";
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new  Scanner (System.in);
		String s=scan.next();
		String t=scan.next();
		
		
		String res=findsubsequence(s,t);
		System.out.println(res);
	}

}