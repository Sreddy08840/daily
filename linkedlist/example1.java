import java.util.LinkedList;

public class example1 {
	public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	//ll.set(0, ll);
	
	System.out.println(ll.contains(20));
	System.out.println(ll.isEmpty());
	System.out.println(ll.size());
	System.out.println(ll.get(2));
	//ll.remove(2);
	//ll.removeAll(ll);
	ll.retainAll(ll);
	System.out.println(ll.peek());
	System.out.println(ll.peekFirst());
	System.out.println(ll.peekLast());
	System.out.println(ll);
	System.out.println(ll.poll());
	System.out.println(ll.pollFirst());
	System.out.println(ll.pollLast());
    System.out.println(ll);
    ll.offer(100);
    System.out.println(ll);
    
	
	}

}