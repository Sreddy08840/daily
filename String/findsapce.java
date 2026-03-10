import java.util.Scanner;

public class findsapce {
	 public static int fintspace(String s){
		int count=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
			
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int res=fintspace(s);
		System.out.println(res);
	}

}
