import java.util.Scanner;

public class findall {
	public static void countfindall(String s){
		int vc =0,cc=0,nc=0,spc=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='B')) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				vc ++;
			}else {
				cc++;
			}
			}
			else if(ch>='0'&&ch<='9') {
				nc++;
			}else {
				spc++;
			}
		}
		System.out.println("vc "+vc);
		System.out.println("cc "+cc);
		System.out.println("nc "+nc);
		System.out.println("spcc "+spc);
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		countfindall(s);
		
	}
}

