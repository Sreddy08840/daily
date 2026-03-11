
import java.util.Iterator;
import java.util.LinkedHashSet;


public class example {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);
		lhs.add(500);
		lhs.add(600);
		System.out.println(lhs);
		System.out.println(lhs.getFirst());
		/*for(Object o:lhs) {
			System.out.println(o);
		}*/
		
		Iterator itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}