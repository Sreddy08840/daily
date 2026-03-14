import java.util.Scanner;

public class removeaddstar {
	
	static String wirtebeforA(String s){
	String t="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a') {
			t=t+"*";
		}else {
			t+=s.charAt(i);
		}
	}
	return t;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s =scan.next();
		
		String res=wirtebeforA(s);
		System.out.println(res);
	}

}