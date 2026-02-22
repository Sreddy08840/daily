
class parent{
	String nose="normal";
	void method(){
		System.out.println("the normal nose'");
	}
}
class child extends parent{
	
}
class example1{
	public static void main(String[] args){
		child c=new child();
		c.method();
	}
}

