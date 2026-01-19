package module19.CollectionFramework.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//wajp to remove duplicates from the given list and print only unique objects.using hashset
public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>  al = new ArrayList<>();
		al.add(10);
		al.add(12);
		al.add(13);
		al.add(12);
		al.add(14);
		al.add(14);
		al.add(null);
		al.add(15);
		al.add(11);
		al.add(10);
		al.add(16);
		al.add(null);
		al.add(10);
		System.out.println("AL: "+al);
		
		Set<Integer> hs = new HashSet<>(al);

	    System.out.println("Unique Elements: " + hs);
		

	}

}
