class parent{
	int a ,b;
	parent(){
		a=100;
		b=200;
	}
	parent (int a ,int b){
		this.a=a;
		this.b=a;
	}
}
class child extends parent{
	int x,y;
	child(){
		
		x=300;
		y=400;
	}
	child(int x,int y){
		this.x=x;
		this.y=y;
	}
	void display(){
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
}
}
class chainning{
	public static void main(String[] args){
		child c=new child();
		c.display();
	}		
}