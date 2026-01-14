package module19.CollectionFramework;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class stringArrToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"Vishnu","Vardhan","Reddy","LPU"};
		List<String> al = new ArrayList<String>();
		for(String name: s) {
			al.add(name);
			
		}
		System.out.println(al);
		
		//Checking whether element exists
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value: ");
		String find = sc.next();
		if(al.contains(find)) {
			int index = al.indexOf(find);
			System.out.println(find + " is Present at index : "+index);
		}else {
			System.out.println(find+ " is Not present in the given list");
		}
	sc.close();
		
		

	}

}
