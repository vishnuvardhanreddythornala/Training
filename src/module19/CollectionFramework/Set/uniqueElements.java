package module19.CollectionFramework.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class uniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(20);
		al.add(40);
		al.add(30);
		al.add(50);
		System.out.println("Original Elements: "+al);
		
		Set<Integer> hs = new HashSet<>(al);
		System.out.println("Unique elements: "+hs);
	}

}
