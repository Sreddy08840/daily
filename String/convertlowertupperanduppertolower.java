import java.util.Scanner;

public class convertlowertupperanduppertolower {
	static String findcharandnumber(String s){
		String t="";
		
		//int  sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z') {
				t =t+(char)(ch+32);
			}
			else if(ch>='a'&&ch<='z'){
				 t=t +(char)(ch-32);
			}
			else {
				 t = t + ch;
			}
		}
		return t;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String res=findcharandnumber(s);
		System.out.println(res);
	}

}
