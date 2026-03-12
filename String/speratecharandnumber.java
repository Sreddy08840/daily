import java.util.Scanner;

public class speratecharandnumber {
	static String findcharandnumber(String s){
		String t=" ";
		String l=" ";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
				t =t+ch;
			}
			else if(ch>='0'&&ch<='9'){
				 l=l+ch;
			}
		}
		return t+l;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String res=findcharandnumber(s);
		System.out.println(res);
	}

}
