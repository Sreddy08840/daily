import java.util.ArrayList;

public class example1 {
	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(10);
		al1.add(10);
		al1.add(10);
		al1.add("santosh");
		al1.add(1,100);
		al1.addAll(al1);
		al1.remove(al1);
		System.out.println(al1.retainAll(al1));
		System.out.println(al1.removeAll(al1));
		System.out.println(al1.isEmpty());
		System.out.println(al1.contains(10));
		System.out.println(al1);
		System.out.println(al1.size());
		
		System.out.println(al1);
		
	}
}