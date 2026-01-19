package module20.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BackwardTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"Vishnu", "Vardhan","Reddy","Thornala"};
		
		List<String> al = new ArrayList<String>();
		
		for(String i : a) {
			al.add(i);
		}
		System.out.println(al);
		
		ListIterator<String> ltr = al.listIterator();
		/*
		System.out.println("===Forward===");
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println();
		System.out.println("===Backward===");
		while(ltr.hasPrevious()) {
			System.out.println(ltr.hasPrevious());
		}
		*/
		
		while(ltr.hasNext()) {
			ltr.next();
			
		}
		while(ltr.hasPrevious()) {
			ltr.previous();
			ltr.remove();
			System.out.println(al);
		}

	}

}
