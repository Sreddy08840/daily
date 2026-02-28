interface Calculator3{
	void add();
	void sub();
	
}
interface Calculator4{
	void mul();
	void div();
}
 abstract class Mycalculator1 implements Calculator3,Calculator4{
	@Override
	public void add() {
		System.out.println(10+20);
		
	}
	@Override
	public void sub() {
		System.out.println(10-20);
		
	}
	@Override
	public void mul() {
		System.out.println(10*20);
		
	}
	@Override
	public void div() {
		System.out.println(10/20);
		
	}
}
 class myCalcu extends Mycalculator1{
	 
 }
public class Main3 {
	public static void main(String[] args) {
		myCalcu my=new myCalcu();
		my.add();
		my.sub();
		my.mul();
		my.div();
		
	}

}
