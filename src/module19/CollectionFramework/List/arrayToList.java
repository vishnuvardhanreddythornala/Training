package module19.CollectionFramework;
//WAJP to convert all the elemets of array into List.
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class arrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for loop
		int[] arr = {1,2,3};
		List<Integer> l =  new ArrayList<Integer>() ;
		
		for(int i = 0; i<arr.length; i++) {
			l.add(arr[i]);
		}
		System.out.println(l);
		
		//for each loop
		int[] arr2 = {1,2,3,4,5,6};
		List<Integer> al =  new ArrayList<Integer>() ;
		for(int i : arr2) {
			al.add(i);		
		}
		System.out.println("Using for each loop: "+al);
		
		//directly using asList 
		List<Integer> al2 =  Arrays.asList(1,2,3,4,5,6);
		System.out.println("Using asList : "+al2);
		
		
		
	}
	
}
