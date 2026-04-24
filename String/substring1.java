import java.util.Scanner;

public class substring1 {
	
	static void findSizeSubString(String s1,int size){
		
		for(int i=0;i<=s1.length()-size;i++) {
			String t ="";
			for(int j=i;j<size+i;j++) {
				t=t+s1.charAt(j);
				
			}
			System.out.println(t);
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1 = scan.next();
		int size =scan.nextInt();
		
findSizeSubString(s1,size);
		
	}
}