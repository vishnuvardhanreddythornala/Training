package module21.Functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demoStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("To print all elements one by one ");
		numbers.stream().forEach(System.out::println);
		
		System.out.println("\n To print only even numbers");
		numbers.stream().filter(n -> n%2 == 0).forEach(System.out::println);
		
		System.err.println("\nTo print Odd number with extra value 3");
		numbers.stream().filter(n -> n%2 !=0).map( n -> n+3).forEach(System.out::println);
		
		System.out.println("\nFind even numbers and stored in another list");
		List<Integer> even_collector =numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		System.out.println(even_collector);
		
		System.out.println();
		List<String> names = List.of("Nitish","Aditya","Devancsh","Mohit","girish");
		System.out.println("\n print objects ends with sh using stream");
		names.stream().filter(name -> name.endsWith("sh")).forEach(System.out::println);
		
		List<Students> st = List.of(
			new Students(3, "Murali" ,75.5),
			new Students(4, "Aditya" ,85.0),
			new Students(1,"Vishnu" ,80.0),
			new Students(2,"Pramod" ,90.5));
			System.out.println("\nprint only those got marks more than 80 using stream");
			st.stream().filter(s -> s.marks > 80.0).forEach(System.out::println);
		
		

	}

}
