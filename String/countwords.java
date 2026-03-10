import java.util.Scanner;

public class countwords {
	 public static int countwords(String s){
			int count=0;
			for(int i=0;i<s.length()-1;i++) {
				if(s.charAt(i)==' '&& s.charAt(i+1)!=0) {
					count++;
				}
				
			}
			return s.charAt(0)==' '?count:count+1;
		}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int res=countwords(s);
		System.out.println(res);
	}
}