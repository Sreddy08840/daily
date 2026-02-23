import java.util.*;
class twoMaxNumber{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		/*if(a<b){
			System.out.println(b);
		}
		else{
			System.out.println(a);
		}*/
		System.out.println(a<b ? b : a );
	}
}
		