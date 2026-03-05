import java.util.Scanner;

class multi extends Thread {
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		String s=t.getName();
		if(s.equals("COUNTCHAR")) {
			countChar();
		}
		else if(s.equals("COUNTNUMBER")) {
			countNumber();
		}
		else {
			add();
		}
		
	}
	public void countChar() {
		try {
		for (int i=65;i<=68;i++) {
			System.out.println((char)i);
			Thread.sleep(2000);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void countNumber() {
		try {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public void add() {
		try {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=scan.nextInt();
		System.out.println("Enter the value");
		int b=scan.nextInt();
		System.out.println(a+b);
		Thread.sleep(1000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Demo45 {
	public static void main(String[] args) {
		multi d1=new multi();
		multi d2=new multi();
		multi d3=new multi();
		d1.setName("COUNTCHAR");
		d2.setName("COUNTNUMBER");
		d3.setName("ADD");
		d1.start();
		d2.start();
		d3.start();
		
	}

}