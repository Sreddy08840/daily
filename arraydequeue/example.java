import java.util.ArrayDeque;
import java.util.Iterator;

public class example {
	public static void main(String[] args) {
		ArrayDeque ard = new ArrayDeque();
		ard.add(10);
		ard.add(20);
		ard.add(30);
		//ard.add(40);
		//ard.remove();
		//ard.push(10);
		//ard.push(20);
		//ard.push(30);
		//ard.push(40);
		//ard.push(50);
		//ard.pop();
		//ard.clear();
		//System.out.println(ard.element());
		//System.out.println(ard.clone());
		//System.out.println(ard.size());
		//for (Object o:ard) {
		//System.out.println(o);
		//}
		//Iterator itr=ard.iterator();
		//while(itr.hasNext()) {
		//	System.out.println(itr.next());
			
	//	}
		Iterator itr=ard.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
