class Captian extends Thread{
	@Override
	public void run() {
		try {
			
			
			battingcoach btc=new battingcoach();
			btc.setName("BATTINGCOACH");
			bowlingcoach boc=new bowlingcoach();
			boc.setName("BOWLINGCOACH");
			
			btc.setDaemon(true);
			boc.setDaemon(true);
			
			btc.start();
			boc.start();
			
			
			
			System.out.println("Captian comes one the filed");
			Thread.sleep(3000);
			System.out.println("Captian ready for practices");
			Thread.sleep(3000);
			System.out.println("Captian paractices the batting");
			Thread.sleep(3000);
			System.out.println("Captian practices the bowling");
			Thread.sleep(3000);
			System.out.println("Captian leave the ground");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class battingcoach extends Thread{
	@Override
	public void run() {
		
			while (true){
				System.out.println("Battaing cpach comes to thr filed");
				try {
				Thread.sleep(3000);
				}
		catch (Exception e) {
		}
		}
		
	}
}
class bowlingcoach extends Thread{
	@Override
	public void run() {
		
			while(true){
				System.out.println("Bowling coach cmes the filed");
				try {
				Thread.sleep(3000);
				}
		
		catch (Exception e) {
			
		}
			}
	}
}

public class Example {
	public static void main(String[] args) {
		
	
		Captian co=	new Captian();
		co.setName("CAPTIAN");
		co.start();
		
	}

}