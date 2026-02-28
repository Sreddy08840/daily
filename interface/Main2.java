
interface Calculator{
	void add();
	void sub();
	
}
class Mycalculator implements Calculator{
	@Override
	public void add() {
		int a=10,b=20;
		System.out.println(a+b);
		
	}
	@Override
	public void sub() {
		int a=10,b=20;
		System.out.println(a-b);
		
	}
	public void mul() {
		int a=10,b=20;
		System.out.println(a*b);
		
	}
}
public class Main2 {
	public static void main(String[] args) {
		Calculator cr;
		Mycalculator mc=new Mycalculator();
		cr=mc;
		cr.add();
		cr.sub();
		((Mycalculator) cr).mul(); 
		
		
	}

}