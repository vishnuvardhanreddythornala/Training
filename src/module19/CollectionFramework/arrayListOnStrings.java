package module19.CollectionFramework;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
/*
 * Write a Java program that performs the following operations on an ArrayList of Strings:
- Create an ArrayList named cities.
- Add the following city names to the list: "Delhi", "Mumbai", "Chennai", "Kolkata".
- Insert the city "Bangalore" at index 2.
- Display all the cities in the list.
- Check whether the city "Mumbai" exists in the list and print a message:
	If found, print: "Mumbai is present in the list."
	Otherwise, print: "Mumbai is not present in the list."
- Sort the list of cities in alphabetical order and display the sorted list.
- Clear the list and print the final size of the ArrayList.
 */
public class arrayListOnStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> city = new ArrayList<String>();
		city.add("Delhi");
		city.add("Mumbai");
		city.add("Chennai");
		city.add("Kolkata");
		
		System.out.println("Cities: "+city);
		
		city.add(2,"Banglore");
		System.out.println("Cities: "+city);
		
		if(city.contains("Mumbai")) {
			System.out.println("Mumbai is present in the list.");
		}else {
			System.out.println("Mumbai is not present in the list.");
		}
		
		//city.sort(null);
		Collections.sort(city);
		System.out.println("Ascending order Sorted Cities: "+city);
		
		Collections.reverse(city);
		System.out.println("Decending order Sorted Cities: "+city);
		
		city.clear();
		
		System.out.println(city.size());
		

	}

}
