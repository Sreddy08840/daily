import java.util.Scanner;

public class eachwordreverse {
	
	static String[] split(String s){
		String t="";
		int j=0;
		int count=countarray(s);
		String[] st=new String[count];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				t +=s.charAt(i);
			}
			else if(t.length()>0) {
					st[j]=t;
					j++;
					t="";
			}
		}
		st[j]=t;
		return st;
		
	}
	
	static int countarray(String s){
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&&s.charAt(+1)!=' ') {
				count ++;
			}
		}
		return s.charAt(0)==' '? count :count+1;
	}
	static String reverse(String s){
		
		String t ="";
		for(int i=s.length()-1;i>=0;i--) {
			t+=s.charAt(i);
		}
		return t;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s =scan.nextLine();
		
		
		String[] res=split(s);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
		System.out.println();
		for(int i=res.length-1;i>=0;i--) {
			System.out.print(res[i]+" ");
		}
		System.out.println();
		for(int i=res.length-1;i>=0;i--) {
			System.out.print(reverse(res[i])+" ");
		}
		System.out.println();
		for(int i=res.length-1;i>=0;i--) {
			System.out.print(reverse(res[i])+res[i].length()+" ");
		}
		
	}
}
