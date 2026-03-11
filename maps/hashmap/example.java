import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class example {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(7,"santosh");
		hm.put(18,"santo");
		hm.put(3,"sano");
		System.out.println(hm.size());
		//hm.clear();
	
		System.out.println(hm);
		
		Collection s=hm.entrySet();
		/*Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		for(Object o:s) {
			System.out.println(o);
		}
		
	}

}
