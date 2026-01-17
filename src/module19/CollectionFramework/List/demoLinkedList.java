package module19.CollectionFramework.List;

import java.util.LinkedList;
import java.util.ListIterator;

//wajp to iterate all the objects of LinkedList in forward and backward direction.
public class demoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Java");
		ll.add("Python");
		ll.add("C++");
		ll.add("C");
		
		System.out.println(ll);
		
		ListIterator<String> ltr = ll.listIterator();
		System.out.println("----------Forward Direction-----------");
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
		System.out.println("-----------Backward Iteration---------");
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
			
		}

	}

}
