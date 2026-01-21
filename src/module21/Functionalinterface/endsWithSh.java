package module21.Functionalinterface;
//wajp to print objects that ends with "a" from names list
//wajp to print only even objects from number list
//wajp tp print details of student who got marks more than 85.
import java.util.Arrays;
import java.util.List;

public class endsWithSh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Thornala","Vishnua","Vardhana","Reddy");
		System.out.println("Names: "+names);
		names.forEach(name -> {
			if(name.endsWith("a")) {
				System.out.println(name);
			}
		});
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		System.out.println("numbers: "+numbers);
		numbers.forEach(num -> {
			if(num % 2== 0) {
				System.out.println(num);
			}
		});
		
		List<Students> st = List.of(
				new Students(3,"Vishnu",90.0),
				new Students(1,"Vardhan",70.0),
				new Students(2,"Reddy",60.0),
				new Students(4,"Thornala",80.0));
		System.out.println("\nStudents: "+st);
		st.forEach(student -> {
			if(student.marks > 80.5) {
				System.out.println(student);
			}
		});

	}

}
