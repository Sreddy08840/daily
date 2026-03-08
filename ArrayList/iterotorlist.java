import java.util.ArrayList;
import java.util.ListIterator;

public class iterotorlist {
public static void main(String[] args) {
	ArrayList al1=new ArrayList();
	al1.add(10);
	al1.add(20);
	al1.add(30);
	al1.add(40);
//	for(int i=0;i<al1.size();i++) {
	//	System.out.println(al1.get(i));
	//}
	//for (Object e:al1) {
		//System.out.println(e);
	//}
	//Iterable itr =al1.iterator();
	
	
	//while(itr.hasNext()) {
	//System.out.println(itr.next());
	ListIterator itr=al1.listIterator(4);
	while(itr.hasPrevious()) {
	System.out.println(itr.previous());
	}
}
}