package module21.Functionalinterface;
import java.util.Arrays;

import java.util.List;

public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Thornala","Vishnu","Vardhan","Reddy");
		System.out.println("Names: "+names);
		names.forEach(name -> System.out.println(name));
		
		List<Students> st = List.of(
				new Students(3,"Vishnu",90.0),
				new Students(1,"Vardhan",70.0),
				new Students(2,"Reddy",60.0),
				new Students(4,"Thornala",80.0));
		System.out.println("\nStudents: "+st);
		st.forEach(student -> System.out.println(student));

	}

}
