import java.util.Scanner;

public class subString {
	
		
		static String findSubString(String s1,String s2){
		 int i=0,j=0;
		 while(i<s1.length()&& j<s2.length()) {
			 if(s1.indexOf(i)==s2.indexOf(j)) {
				 i++;
				 j++;
			 }
			 else {
				 i++;
			 }
			
		 }
		 return j==s2.length() ? "yes" :"no";
		}
		
		public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		String s2=scan.next();
		String res =findSubString(s1,s2);
		System.out.println(res);
	}
}