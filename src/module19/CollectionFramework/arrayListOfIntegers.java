package module19.CollectionFramework;
/*
 * Write a Java program that performs the following using an ArrayList of integers:
- Add the following numbers to the list: 10, 5, 20, 15, 25.
- Insert the number 12 at index 2.
- Print all elements of the list.
- Check if the number 15 exists in the list and print an appropriate message.
- Sort the list in ascending order.
- Remove the number 5 from the list.
- Print the final list and its size.
 */
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
public class arrayListOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(5);
		num.add(20);
		num.add(15);
		num.add(25);
		System.out.println("List of numbers: "+num);
		
		num.add(2,12);
		System.out.println("List of numbers: "+num);
		
		if(num.contains(15)) {
			System.out.println(num + "is presnt in the list");
		}else {
			System.out.println(num + "is not present in the list");
		}
		Collections.sort(num);
		System.out.println("List of numbers after sorted: "+num);
		
		num.remove(Integer.valueOf(5));
		System.out.println("List of numbers after removing 5: "+num);
		
		
		//num.size();
		System.out.println("Final List: "+num );
		System.out.println("Size of List: "+num.size());

	}

}


