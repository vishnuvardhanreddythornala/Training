package module19.CollectionFramework.Set;
//Check whether a given element exists in a Set.
import java.util.HashSet;
import java.util.Set;

public class CheckElementPresence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,3};
		Set<Integer> hs = new HashSet<>();
		for(int i : a) {
			hs.add(i);
			
		}
		int searchElement = 7;
		if(hs.contains(searchElement)) {
			System.out.println("The element is present in the set");
		}
		else {
			System.out.println("The element is not present in the set");
		}
		
		

	}

}
