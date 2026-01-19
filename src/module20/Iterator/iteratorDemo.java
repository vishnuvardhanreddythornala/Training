package module20.Iterator;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class iteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 21, 23, 25, 26};
		
		List<Integer> al = new ArrayList<Integer>();
		for(int i : a) {
			al.add(i);		
		}
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator();
		/*
		System.out.println(itr);// ArrayList$Itr@2a139a55
		System.out.println(itr.hasNext());
//		itr.remove(); IllegalStateException
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
//		System.out.println(itr.next()); NoSuchElementException
		 */
		

		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

