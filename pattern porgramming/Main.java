public class Student {

	

	int age;

	String name;

	

	void study()

	{

		System.out.println("studying");

	}



}
public class Main {



	public static void main(String[] args) {

		

		Student s1 = new Student();

		s1.age = 15;

		s1.name = "Rama";

		System.out.println(s1.age);

		System.out.println(s1.name);

		s1.study();

		

		//new Student().study();

		

	System.out.println(new Student().name);	



	}



}