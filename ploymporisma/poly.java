class Animal{
	void Berath() {
		System.out.println("The animals are breath");
	}
	void Eat() {
		System.out.println("The animalas are eat");
	}
	void Sleep() {
		System.out.println("THe animals are sleep");
	}
}
class Lion extends Animal{
	@Override
	void Eat() {
		System.out.println("The lions arre eat meat");
	}
	@Override
	void Sleep() {
		System.out.println("The lions are sleep in caves");
	}
}
class Moneky extends Animal{
	@Override
	void Eat() {
		System.out.println("The moneky arre eat bannan");
	}
	@Override
	void Sleep() {
		System.out.println("The lions are sleep on tree");
	}
}
class main{
	void system(Animal ref) {
		ref.Berath();
		ref.Eat();
		ref.Sleep();
	}
}

public class poly {
	public static void main(String[] args) {
		 
		 Lion ls=new Lion();
		 Moneky mk=new Moneky();
		 main m=new main();
		 m.system(ls);
		 System.out.println();
		 m.system(mk);
		 
	}

}