package module19.CollectionFramework;
//wajp to print all the elements of list one by one using getmethod.
import java.util.List;
import java.util.ArrayList;
public class getMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lpu = new ArrayList<String>();
		
		lpu.add("CSE");
		lpu.add("ECE");
		lpu.add("Mecanical");
		lpu.add("BBA");
		
		for(int i = 0; i<lpu.size(); i++) {
			System.out.println(lpu.get(i));
		}
		
//		System.out.println(lpu.get(0));
//		System.out.println(lpu.get(1));
//		System.out.println(lpu.get(2));
//		System.out.println(lpu.get(3));
		
		
		

	}

}
