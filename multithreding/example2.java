class Hero extends Thread{
	@Override
	public void run() {
		try {
			
			dircatory dr=new dircatory();
			dr.setName("DERICOTRY");
			porducers pr=new porducers();
			pr.setName("PORDUCERS");
			
			dr.setDaemon(true);
			pr.setDaemon(true);
			
			dr.start();
			pr.start();
			
			
			System.out.println("The hero is coming on set");
			Thread.sleep(3000);
			System.out.println("The hero is reading script");
			Thread.sleep(3000);
			System.out.println("The hero is getting read");
			Thread.sleep(3000);
			System.out.println("The hero doing acting");
			Thread.sleep(3000);
			System.out.println("The hero leave set");
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
class dircatory extends Thread{
	@Override
	public void run() {
		while(true) {
			
			System.out.println("THe diricatory is coming and going with hero");
			try {
			Thread.sleep(3000);
			}catch (Exception e) {
				// TODO: handle exception
			}
			}
		}
	}
class porducers extends Thread{
	
	@Override
	public void run() {
while(true) {
			System.out.println("THe porducer is coming and going with hero");
			try {
			Thread.sleep(3000);
			}catch (Exception e) {
				// TODO: handle exception
			}
			}
	}
}

public class example2 {
	public static void main(String[] args) {
	Hero h=new Hero();
	h.setName("HERO");
	
	
	h.start();
	
	
	}
    
}