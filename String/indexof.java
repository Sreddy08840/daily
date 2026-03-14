import java.util.Scanner;

public class indexof {
	
	static int findindexof(String s,char k){
	
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==k) {
			return i;
		}
	}
	return -1;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s =scan.next();
		char k =scan.next().charAt(0);
		
		int res=findindexof(s,k);
		System.out.println(res);
	}

}