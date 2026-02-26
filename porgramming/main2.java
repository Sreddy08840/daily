

class bike{
	private String brand;
	private int milage;
	
	public bike(String brand,int milage) {
		this.brand=brand;
		this.milage=milage;
	}
	public String getBrand() {
		return brand;
	}
	public int getMilage() {
		return milage;
	}
}
class Book{
	private String name;
	private String author;
	public Book(String name,String author) {
		this.author=author;
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
}
class heart{
	private int  wight;
	private int bpm;
	public heart(int wight,int bpm) {
		this.bpm=bpm;
		this.wight=wight;
	}
	public int getWight() {
		return wight;
	}
	public int getBpm() {
		return bpm;
	}
}
class Brian{
	private int weight;
	private String color ;
	
	public Brian(int weight,String color) {
		this.color=color;
		this.weight=weight;
	}
	public int getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
}
class Student{
	heart hr  =new heart(250,72);
	Brian br =new Brian(1000,"red");
	void bk(bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getMilage());
	}
	void bok(Book ba) {
		System.out.println(ba.getAuthor());
		System.out.println(ba.getName());
	}
}

public class main2 {
	public static void main(String[] argss) {
		Student stu=new Student();
		bike b=new bike("royal",12);
		Book ba =new Book("santosh","coding");
		System.out.println(stu.hr.getWight());
		System.out.println(stu.hr.getBpm());
		System.out.println(stu.br.getColor());
		System.out.println(stu.br.getWeight());
		stu.bk(b);
		stu.bok(ba);
		
	}

}
