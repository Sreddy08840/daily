import java.util.Scanner;

class inputExaotion extends Exception{
	
}
class atm{
	int password=9620;
	int p;
	void takeInput() {
		Scanner scan=new Scanner(System.in);
		p=scan.nextInt();
	}
	void start()throws Exception {
		if(password==p) {
			System.out.println("collect your cash:");
		}
		else {
			System.out.println("Password is worng,please try again");
			inputExaotion iie=new inputExaotion();
			throw iie;
		}
	}
}
class Bank{
	void bank() {
	atm a=new atm();
	try {
	a.takeInput();
	a.start();
	}
	catch (Exception e) {
		try {
			a.takeInput();
			a.start();
		}
		catch(Exception d) {
			try {
			a.takeInput();
			a.start();
			}
			catch(Exception f) {
				System.out.println("you tryed many times please contact the bank:");
			}
		}
	}
	}
	
}


public class RBI {
	public static void main(String[] args) {
		Bank B=new Bank();
		B.bank();
	}
	

}