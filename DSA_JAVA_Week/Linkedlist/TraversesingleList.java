class Node{
	int data;
		Node next;
		
		Node(int new_data){
		data=new_data;
		next=null;
}
}
public class TraversesingleList{
	static void traversesingleList(Node head){
		if (head==null){
			System.out.println();
			return;
		}
		System.out.print(head.data);
		
		if (head.next !=null){
			System.out.print("->");
		}
		
		traversesingleList(head.next);
	}
	public static void main (String[] args ){
		 Node head =new Node(10);
		 head.next=new Node(20);
		  head.next.next = new Node(30);
		  head.next.next.next = new Node(40);
		  
		  traversesingleList(head);
	}
}

			
