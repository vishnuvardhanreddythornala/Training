package module19.CollectionFramework.Set;
import java.util.Set;
import java.util.TreeSet;
public class demoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> ts = new TreeSet<String>();
		ts.add("Vishnu");
		ts.add("Vardhan");
		ts.add("Reddy");
		ts.add("Thornala");
		ts.add("Manideep");
		ts.add("Vineeth");
		ts.add("Raghu");
		System.out.println("ASC: "+ts);
		
		TreeSet<String> dts = (TreeSet) ts;
		System.out.println("DESC: "+dts.descendingSet());
	}

}
