package module19.CollectionFramework;
import java.util.List;
import java.util.ArrayList;
public class intArrToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,21,23,25,26,28,22,23,21,24,25,26};
		List<Integer> al = new ArrayList<Integer>();
		
		
		for(int i : a) {
			al.add(i);
		}
		System.out.println("Original List:"+ al);
		
		
		for(int i = 0; i<al.size(); i++) {
			if(al.get(i) % 2 !=0) {
				al.remove(i);
				i--;
			}
		}
		System.out.println("Even List: "+al);

	}

}
//wajp to remove all the odd objects from the list
//output: [10,26,28,22,24,26]