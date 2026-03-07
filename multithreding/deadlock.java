
class Warriar extends Thread{
	String nuclearBomb1 = "barmastra";
	String nuclearBomb2 = "pasuptars";
	String nuclearBomb3= "sarpastra";
	
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("ARJUNA")) {
			arjuna();
		}
		else{
			karna();
		}
	}
	
	
	
	void arjuna(){
	  try {
		  Thread.sleep(3000);
		  synchronized (nuclearBomb3) {
			  System.out.println("Arjuna got a batmastar");
			  Thread.sleep(3000);
			  synchronized (nuclearBomb2) {
				  System.out.println("Arjuna got a pasuptar");
				  Thread.sleep(3000);
				  synchronized (nuclearBomb1) {
					  System.out.println("Arjuna got a sarpastara");
					  Thread.sleep(3000);
			  
				  }
		}
		  
		}
	  }
	  catch (Exception e) {
		e.printStackTrace();
	}
}
	void karna(){
		  try {
			  Thread.sleep(3000);
			  synchronized (nuclearBomb1) {
				  System.out.println("karna got a batmastar");
				  Thread.sleep(3000);
				  synchronized (nuclearBomb2) {
					  System.out.println("karna got a pasuptar");
					  Thread.sleep(3000);
					  synchronized (nuclearBomb3) {
						  System.out.println("karna got a sarpastara");
						  Thread.sleep(3000);
				  
					  }
			}
			  
			}
		  }
		  catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
public class deadlock {
	
	public static void main(String[] args) {
		Warriar w1=new Warriar();
		w1.setName("ARJUNA");
		Warriar w2=new Warriar();
		w2.setName("KARNA");
		
		w1.start();
		w2.start();
	}

}
