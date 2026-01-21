package module21.Functionalinterface;

import java.util.List;


public class sortAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java Stream one-liner to sort Students objects by id in ascending order and print them.
		List<Students> st = List.of(
				new Students(3, "Murali" ,75.5),
				new Students(4, "Aditya" ,85.0),
				new Students(1,"Vishnu" ,80.0),
				new Students(2,"Pramod" ,90.5));
				System.out.println("\nsorting Students objects by id in ascending order");
				st.stream().sorted((s1,s2) -> Integer.compare(s1.id, s2.id)).forEach(System.out::println);
				
		//Write a Java Stream one-liner to sort Students objects by id in descending order and print them.
		List<Students> st1 = List.of(
				new Students(3, "Murali" ,75.5),
				new Students(4, "Aditya" ,85.0),
				new Students(1,"Vishnu" ,80.0),
				new Students(2,"Pramod" ,90.5));
				System.out.println("\nsorting Students objects by id in decending order");
				st1.stream().sorted((s1,s2) -> Integer.compare(s2.id, s1.id)).forEach(System.out::println);
				
		//Write a Java Stream one-liner to sort Students objects based on name and display the result.
				List<Students> st2 = List.of(
						new Students(3, "Murali" ,75.5),
						new Students(4, "Aditya" ,85.0),
						new Students(1,"Vishnu" ,80.0),
						new Students(2,"Pramod" ,90.5));
						System.out.println("\nsorting Students objects by id in decending order");
						st2.stream().sorted((s1,s2) -> s1.name.compareTo(s2.name)).forEach(System.out::println);
	}

}
