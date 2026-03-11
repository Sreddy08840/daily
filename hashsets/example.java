package hashsets;

import java.util.HashSet;
import java.util.Iterator;


public class example {
	public static void main(String[] args){
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(10.5);
		hs.add(300);
		hs.add(400);
		System.out.println(hs);
		//hs.remove(100);
		//hs.clear();
		//System.out.println(hs.size());
		
		
	   /* for(Object o :hs) {
		System.out.println(o);
	    }*/
		
	/* Iterator itr=hs.iterator();
	 
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }*/
		System.out.println(hs);
	}
}
