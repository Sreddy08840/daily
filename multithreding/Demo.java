import java.util.Scanner;

class Demo1 extends Thread{
	@Override
	public void run() {
		try {
		for(int i=65;i<=68;i++) {
			System.out.println((char)(i));
			Thread.sleep(3000);
		}
		}
		catch(Exception e) {
			
		}
		}
	}

class Demo2 extends Thread{
	@Override
	public void run() {
		try {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			Thread.sleep(3000);
		}
	}
		catch(Exception e) {
			
		}
		}
}
class Demo3 extends Thread{
	@Override
	public void run() {
	Scanner	scan=new Scanner(System.in);
	System.out.println("enter the value");
	int a=scan.nextInt();
	System.out.println("enter the value");
	int b=scan.nextInt();
	System.out.println(a+b);
	
	}
}

public class Demo {
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		d1.start();
		d2.start();
		d3.start();
	}
	

}