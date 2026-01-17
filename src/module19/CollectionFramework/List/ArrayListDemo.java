package module19.CollectionFramework;
import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 List al = new ArrayList();
	 al.add(10);
	 al.add(10.5);
	 al.add('a');
	 al.add("LPU");
	 al.add(false);
	 
	 System.out.println(al);
	 System.out.println(al.size());
	 
	 al.add(15);
	 System.out.println(al);
	 System.out.println(al.size());
	 
	 al.add("LPU");
	 al.add('a');
	 
	 System.out.println(al);
	 System.out.println(al.get(2));
	 
	 al.add(null);
	 System.out.println(al);
	 
	 
		

	}

}
