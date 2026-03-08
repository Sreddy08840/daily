
import java.util.Scanner;

public class substring {
public static void  findsubstring(String s,int size){
		for(int i=0;i<s.length()-size;i++) {
			String t="";
			for(int j=i;j<size+i;j++) {
				 t= t+s.charAt(j);
			}
			System.out.println(t);
		}
	}
	
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 String s =scan.next();
		 int size=scan.nextInt();
		 
		findsubstring(s,size);
	}

}
