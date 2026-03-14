import java.util.Scanner;

public class removespacestartingcenterapce {
	
	static String findremovestartingandlast(String s){
		String t ="";
		int si = 0 ;
		int li = 0 ;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				si=i;
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!=' ' ||(s.charAt(i)!=' '&&s.charAt(i+1)!=' ')) {
				li=i;
				break;
			}
		}
		for(int i=si;i<=li;i++) {
			if(s.charAt(i)!=' ' ||(s.charAt(i)==' '&&s.charAt(i+1)!=' ')) {
			t =t+s.charAt(i);
			}	
		}
		return t;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		String res=findremovestartingandlast(s);
		System.out.println(res);
	}

}
