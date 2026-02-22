class grandparent{
	void method(){
		System.out.println("the multilevel inhertinace ");
	}
}
class parent extends grandparent{
}
class child extends parent{
}






class multilevel{
	public static void main(String[] args){
		child c= new child();
		c.method();
	}
}
