package module19.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class DifferenceofSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3, 4};

		int[] B = {3, 4, 5, 6};
		
		Set<Integer> hs1 = new HashSet<>();
		for(int i : A) {
			hs1.add(i);
		}
		Set<Integer> hs2 = new HashSet<>();
		for(int j : B) {
			hs2.add(j);
		}
		
		Set<Integer> resultSet = new HashSet<>(hs1);
		
		resultSet.removeAll(hs2);
		
		System.out.println("Difference of sets (A-B): "+resultSet);
	}

}
