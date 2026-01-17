package module19.CollectionFramework.List;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> v = new Vector<String>();
		v.add("Thornala");
		v.add("Vishnu");
		v.add("Vardhan");
		v.add("Reddy");
		
		System.out.println(v);
		System.out.println(v.size());
		
		for(int i = 0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println("-----");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
