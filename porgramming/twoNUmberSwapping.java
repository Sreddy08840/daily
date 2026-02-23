import java.util.Scanner;
class twoNUmberSwapping{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		/*int c;
		c=a;
		a=b;
		b=c;*/
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
}
		