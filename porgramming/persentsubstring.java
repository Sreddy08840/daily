import java.util.Scanner;

public class persentsubstring{
public static String  findsubstring(String s,String l){
		int size=l.length();
		for(int i=0;i<s.length()-size;i++) {
			String t="";
			for(int j=i;j<size+i;j++) {
				 t= t+s.charAt(j);
			}
			if(l.equals(t)) {
				return "yes";
			}
			
		}
		return "no";
	}
	
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 String s =scan.next();
		 String l=scan.next();
		 
		String res=findsubstring(s,l);
		System.out.println(res);
	}

}
