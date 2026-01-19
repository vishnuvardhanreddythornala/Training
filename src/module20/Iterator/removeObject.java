package module20.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class removeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 21, 23, 25, 26}; 
		
		List<Integer> al = new ArrayList<Integer>();
		for(int i : a) {
			al.add(i);		
		}
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			itr.next();
			itr.remove();

			System.out.println(al);
		}

	}

}
