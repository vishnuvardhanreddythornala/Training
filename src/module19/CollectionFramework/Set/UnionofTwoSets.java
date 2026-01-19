package module19.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

//Find the union of two sets using Set methods.
public class UnionofTwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,3};
		int[] b = {6,1,7,2,8,6};
		
		Set<Integer> hs1 = new HashSet<>();
		for(int i : a) {
			hs1.add(i);
				
		}
		Set<Integer> hs2 = new HashSet<>();
		for(int j : b) {
			hs2.add(j);
		}
		Set<Integer> resultset =  new HashSet<>();
		resultset.addAll(hs1);
		resultset.addAll(hs2);
		System.out.println("Union of two sets: " + resultset);

	}

}
