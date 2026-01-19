package module19.CollectionFramework.Queue;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demoHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Map  hm = new HashMap();
		hm.put(10, "XYZ");
		hm.put(12.5, false);
		hm.put(null, null);
		hm.put(true, 10);
		hm.put('a', 'a');
		hm.put("LPU", 100);
		System.out.println(hm);
		
		System.out.println(hm.remove(true));
		System.out.println(hm.remove("Jalandhar"));
		
		System.out.println(hm.containsKey(true));
		System.out.println(hm.containsKey("LPU"));
		
		System.out.println(hm.containsValue("XYZ"));
		System.out.println(hm.containsValue(10));
		
		System.out.println(hm.get(10));
		
		Set entries = hm.entrySet();
		System.out.println("Set: "+entries);
		for(Object obj : entries) {
			System.out.println(obj);
		}
		
		Set keys  = hm.keySet();
		System.out.println("KEYS: "+keys);
		
		Iterator itr = keys.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		Collection  values = hm.values();
		System.out.println("VALUES: "+values);
		
		Iterator itr2 = values.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		

	}

}
