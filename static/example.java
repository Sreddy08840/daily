
class parent{
	 final int a=8;
}
class child extends parent {
    
	final int a =9;
	void mehod() {
		System.out.println(a);
	}
}



public class example {
	public static void main(String[] args) {
		child c=new child();
        c.mehod();
		
	}
}