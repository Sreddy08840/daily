import java.util.Scanner;

public class eachword {
	
	static String[] spilt(String s){
		int j=0;
		String l="";
		int count =countwords(s);
		String[] ar=new String [count];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				l =l+ s.charAt(i);
				
			}else if(l.length()>0){
				ar[j]=l;
				j++;
				l="";
			}
		}
		ar[j]=l;
		return ar;
	}
	
	static int countwords(String s){
		int count =0;
		for (int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
				count++;
			}
		}
		return s.charAt(0)==' '? count:count +1;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s =scan.nextLine();
		String[] res=spilt(s);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
	

}