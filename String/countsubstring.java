import java.util.Scanner;

public class countsubstring {
	
	static int findSizeSubString(String s1,String s2){
		int size =s2.length();
		int count =0;
		for(int i=0;i<=s1.length()-size;i++) {
			String t ="";
			for(int j=i;j<size+i;j++) {
				t=t+s1.charAt(j);
				
			}
			if(t.equals(s2)) {
			count++;
			}
		}
		return count;
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1 = scan.next();
	    String s2 =scan.next();
		  
        int res=findSizeSubString(s1,s2);
        System.out.println(res);
		
	}
}