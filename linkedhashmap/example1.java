package linkedhashmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class example1 {
	public static void main(String[] args) {
	LinkedHashMap lhm=new	LinkedHashMap();
	lhm.put(1,"santosh");
	lhm.put(2,"raj");
	lhm.put(3, "soo");
	
	System.out.println(lhm.entrySet());
	System.out.println(lhm.keySet());
	System.out.println(lhm.values());
	System.out.println(lhm.get(2));
	System.out.println(lhm.remove(2));
	System.out.println(lhm.containsKey(3));
	
	System.out.println(lhm);
	
	Set s =lhm.entrySet();
    Iterator itr=s.iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.next());
    }
    
	}
}