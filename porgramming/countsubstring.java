import java.util.Scanner;

public class countsubstring {
public static int  findsubstring(String s,String l){
		int size=l.length();
		int count=0;
		for(int i=0;i<s.length()-size;i++) {
			String t="";
			for(int j=i;j<size+i;j++) {
				 t= t+s.charAt(j);
			}
			if(l.equals(t)) {
				count++;
			}
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 String s =scan.next();
		 String l=scan.next();
		 
		int res=findsubstring(s,l);
		System.out.println(res);
	}

}