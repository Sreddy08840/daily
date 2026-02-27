import java.util.Scanner;

abstract class Shape{
	float area;
	abstract void acceptInput();
	abstract void calcArea();
	void Area() {
		System.out.println("The area is :"+area);
	}
}
class Square extends Shape{
	private float side;
	@Override
	void acceptInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the side :");
		side =sc.nextFloat();	
	}
	@Override
	void calcArea() {
		area=side*side;	
	}
}
class Rectagle extends Shape{
	private float length;
	 private float breath;
	@Override
	void acceptInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the length :");
		length =sc.nextFloat();
		System.out.println("Enter the Breath :");
		breath=sc.nextFloat();		
	}
	@Override
	void calcArea() {
		area=length*breath;	
	}
	
}
class Circle extends Shape{
	final float PI=3.14f;
	private float raidus;
	@Override
	void acceptInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the radius :");
		raidus =sc.nextFloat();	
		
	}
	@Override
	void calcArea() {
		area=PI*raidus*raidus;
	}
}
class demontre{
	void piot (Shape sp){
		sp.acceptInput();
		sp.calcArea();
		sp.Area();
	}
}

public class Main {
	public static void main(String[] args) {
		Square sq=new Square();
		Rectagle rt =new Rectagle();
		Circle cr=new Circle();
		demontre de=new demontre();
		de.piot(sq);
		de.piot(cr);
		de.piot(rt);
		
	}

}
