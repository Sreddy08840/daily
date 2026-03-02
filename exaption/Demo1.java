package exaption;

import java.util.Scanner;

class Demo2{
	void fun1() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("The Porgarm is Satrted4");
		System.out.println("Enter number of numeator:");
		int a=scan.nextInt();
		System.out.println("Enter the dempntor: ");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
		
		
		System.out.println("The function is terminted4");
	}
}
class Demo3{
	void fun2() {
	 Demo2 d2=new Demo2();
	 System.out.println("The Porgarm is Satrted3");
	 d2.fun1();
	 System.out.println("The function is terminted3");
	}
}
class Demo4{
	void fun3() {
	Demo3 d3=new Demo3();
	System.out.println("The Porgarm is Satrted2");
	try {
	d3.fun2();
	}
	catch(Exception e) {
		System.out.println("The Enter the non-zero demonator:");
	}
	System.out.println("The function is terminted2");
	}
}

public class Demo1 {
	public static void main(String[] args) {
	Demo4 d4=new Demo4();
	System.out.println("The Porgarm is Satrted1");
	d4.fun3();
	System.out.println("The function is terminted1");
	}

}
