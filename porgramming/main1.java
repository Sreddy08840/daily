class os{
	private String name;
	private int  Size;
	public os(String name,int Size) {
		this.name=name;
		this.Size=Size;
		
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return Size;
	}
}
class Charger{
	private String brand;
	private int volatage;
	public Charger(String brand,int volatage) {
		this.brand=brand;
		this.volatage=volatage;
		
	}
	public String getBrand() {
		return brand;
	}
	public int getVolatage() {
		return volatage;
	}
}
class Mobile{
	os comp=new os("andied",2);
	void aggri(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVolatage());
	}
}

public class main1 {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		Charger c=new Charger("samasage",25);
		System.out.println(m.comp.getName());
		System.out.println(m.comp.getSize());
		m.aggri(c);
		
		
		m=null;
		
		System.out.println(c.getBrand());
	}

}