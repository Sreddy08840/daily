import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class accessing {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		
		for (int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		System.out.println();
		for(Object e:ll) {
			System.out.println(e);
		}
		
		System.out.println();
		
		Iterator itr=ll.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		ListIterator itr1 =ll.listIterator(ll.size());
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
	}

}
