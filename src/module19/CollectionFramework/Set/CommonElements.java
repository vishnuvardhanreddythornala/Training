package module19.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

/*
 * Find common elements between two integer arrays using HashSet.
 */
public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,3};
		int[] b = {6,1,7,2,8,6};
		
		Set<Integer> hs = new HashSet<>();
		for(int i : a) {
			hs.add(i);
			
			
		}
		System.out.println(hs);
		Set<Integer> common = new HashSet<>();
		for(int j: b) {
			if(hs.contains(j)) {
				common.add(j);
			}
		    
		}
		System.out.println("Common elements: " + common);
	}

}
