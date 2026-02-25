package ploymporisma;
class Plain{
	void fly() {
		System.out.println("the plain is flying");
	}
	void landing() {
		System.out.println("the lading is  levelrun way");
		
	}

}
class CargoPlain extends Plain{
	@Override
	void fly() {
		System.out.println("the plain is fly lower range");
	}
	@Override
	void landing() {
		// TODO Auto-generated method stub
		System.out.println("the lading is midddile levelrun way");
	}
}
class PassengerPlain extends Plain{
	@Override
	void landing() {
		System.out.println("the lading is midddile levelrun way");
	}
		
	}

	

public class polymorphism {
	public static void main(String[] args) {
		Plain ref ;
		PassengerPlain pp=new PassengerPlain();
		CargoPlain cp=new CargoPlain();
		ref=pp;
		
		ref.fly();
		ref.landing();
		
		System.out.println();
		ref=cp;
		ref.fly();
		ref.landing();
		
		
	}

}
