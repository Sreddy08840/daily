import java.util.Scanner;

interface Calculator{
	public abstract void add();
	public abstract void sub();
}
class MyCalculator1 implements Calculator{
	@Override
	public void add() {
		int a=100;
		int b=150;
		System.out.println(a+b);
		
	}
	@Override
	public void sub() {
		int a=100;
		int b=150;
		System.out.println(a+b);
		
	}
}
class MyCalculator2  implements Calculator{
	@Override
	public void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the number of A:");
		int a=sc.nextInt();
		System.out.println("Enter the the number of :B");
		int b=sc.nextInt();
		System.out.println(a+b);
		
	}
	@Override
	public void sub() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the number of A:");
		int a=sc.nextInt();
		System.out.println("Enter the the number of :B");
		int b=sc.nextInt();
		System.out.println(a-b);
		
	}
}
class MyCalculator3 implements Calculator{
	@Override
	public void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the number of A:");
		int a=sc.nextInt();
		System.out.println("Enter the the number of :B");
		int b=sc.nextInt();
		if(a<b) {
			System.out.println(a+b);
		}
		else {
			System.out.println("invalid number");
			
		}
		
	}
	@Override
	public void sub() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the number of A:");
		int a=sc.nextInt();
		System.out.println("Enter the the number of :B");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a-b);
		}
		else {
			System.out.println("invalid number");
			System.exit(0);
		}
		
	}
}
	class cisio{
		void pirot(Calculator cb) {
			cb.add();
			cb.sub();
		}
	}


public class Main {
	public static void main(String[] args) {
		MyCalculator1 mc1 =new MyCalculator1();
		MyCalculator2 mc2 =new MyCalculator2();
		MyCalculator3 mc3 = new MyCalculator3();
		cisio cs =new cisio();
		cs.pirot(mc1);
		cs.pirot(mc2);
		cs.pirot(mc3);
		
		
	}

}
