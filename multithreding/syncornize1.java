class bothRoom{
	  void BothRoom(){
		 try {
			 
			 synchronized (this) {
				 System.out.println(Thread.currentThread().getName()+" The bpy opens the bathroom ");
				 Thread.sleep(3000);
				 System.out.println(Thread.currentThread().getName()+" The bpy go to the bathroom ");
				 Thread.sleep(3000);
				 System.out.println(Thread.currentThread().getName()+" The bpy sit to the bathroom ");
				 Thread.sleep(3000);
					 }
		
		 System.out.println(Thread.currentThread().getName()+" The bpy come back the bathroom ");
		 Thread.sleep(3000);
		 }catch (Exception e) {
			e.printStackTrace();
		}
		 
	 }
}
class Boy extends Thread{
	bothRoom b;
	Boy(bothRoom b){
		this.b=b;
	}
	@Override
	public void run() {
		b.BothRoom();
	
	}
}
class Girl extends Thread{
	bothRoom b;
	Girl(bothRoom b){
		this.b=b;
	}
	
	@Override
	public void run() {
		b.BothRoom();
		
	}
}
class Other extends Thread{
	bothRoom b;
	Other(bothRoom b){
		this.b=b;
	}
	@Override
	public void run() {
		b.BothRoom();
		
	}
}
public class syncornize1 {
	public static void main(String[] args) {
	
	 bothRoom bo=new bothRoom();
	 
	 Boy b=new Boy(bo);
	 Girl g=new Girl(bo);
	 Other o=new Other(bo);
	 b.setName("BOY");
	 g.setName("GIRl");
	 o.setName("OTHER");
	 
	 b.start();
	 g.start();
	 o.start();
	 
	}
	 

}
