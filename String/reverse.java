import java.util.Scanner;

public class reverse {
	
static String findreverse(String s){
		String t="";
		int i=0;
		for ( i = s.length()-1;i >= 0;i--) {
			t = t+s.charAt(i);
		}
		return t;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s =scan.next();
		String res =findreverse(s);
		System.out.println(res);
	}

}