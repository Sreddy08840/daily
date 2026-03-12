import java.util.Scanner;

public class converlowercase {
	static String findcharandnumber(String s){
		String t=" ";
		//int  sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
				t =t+(char)(ch+32);
			}
			/*else if(ch>='0'&&ch<='9'){
				 sum=sum +(ch-48);
			}*/
		}
		return t;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String res=findcharandnumber(s);
		System.out.println(res);
	}

}
