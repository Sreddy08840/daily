abstract class Bird{
	abstract void eat();
	abstract void fly();
	
}
abstract class Eagle extends Bird{
	@Override
	void fly() {
	System.out.println("the eagle is fly high surdace ");
	}
}
class serpentEagle extends Eagle{
	@Override
	void eat() {
		System.out.println("the serpentEangle is eat sneaks");
	}
}
class goldenEagles extends Eagle{
	@Override
	void eat() {
		System.out.println("The goldenEagles is eat sea foods");
		
	}
}
class birdfamily{
	void pioierty(Bird b) {
		b.eat();
		b.fly();
	}
}




public class abastrct {
	public static void main(String[] args) {
		serpentEagle se=new serpentEagle();
		goldenEagles ge =new goldenEagles();
		birdfamily bf=new birdfamily();
		bf.pioierty(ge);
		bf.pioierty(se);
		
	}

}
