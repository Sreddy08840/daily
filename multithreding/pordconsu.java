class queue{
	private int data ;
	boolean isEmpty=false;
	public synchronized void  setdata(int data){
		if (isEmpty == false) {
		this.data=data;
		System.out.println("The set data is :"+data);
		isEmpty=true;
		notify();
		}
		else {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void  getData() {
		if(isEmpty == true) {
		System.out.println("the get data is porducer"+data);
		isEmpty=false;
		notify();
		}
		else {
			try {
				wait();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
class porducer extends Thread{
	
	queue q;
	porducer(queue q){
		this.q=q;
	}
	
	
	@Override
	public void run() {
		int i=1;
		for(;  ;) {
		q.setdata(i++);
		}
	}
}
class counsumer extends Thread{
	
	queue q;
	counsumer(queue q){
		this.q=q;
	}
	@Override
	public void run() {
		
		for (; ;) {
		q.getData();
		}
	}
}


public class pordconsu {
public static void main(String[] args) {
	queue q=new queue();
	porducer pr =new porducer(q);
	pr.setName("Porducer");
	counsumer cr =new counsumer(q);
	cr.setName("consumer");
	
	pr.start();
	cr.start();
	
}
}