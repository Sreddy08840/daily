import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class MINAge extends Exception{
	
}
class MAxAge extends Exception{
	
}
class age{
	int minAge=18;
	int maxAge=66;
	int age;
	void inputage() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the person age:");
		int age=scan.nextInt();
	}
	void virfy()throws Exception {
		if(minAge < age && age<maxAge) {
			System.out.println("The person is eligible for derving");
		}
		else if(minAge < age){
			System.out.println("thr person is under age for derving:");
			MINAge Min=new MINAge();
			throw Min;
		}
		else {
			System.out.println("thr person is upper  age for derving:");	
			MAxAge Max=new MAxAge();
			throw Max;
		}
	}
}
class Deriving{
	void licence() {
		age a=new age();
		try {
		a.inputage();
		a.virfy();
		}
		catch(Exception e){
			try {
				a.inputage();
				a.virfy();
				}
				catch(Exception d){
					try {
						a.inputage();
						a.virfy();
						}
						catch(Exception f){
							try {
								a.inputage();
								a.virfy();
								}
								catch(Exception h){
								System.out.println("you enter multiple timees worng input block you user");
								}
						}
				}
		}
	}	
}
	
public class DerivingLicince {
	public static void main(String[] args) {
	Deriving Dr=new Deriving();
	Dr.licence();
	}

}
