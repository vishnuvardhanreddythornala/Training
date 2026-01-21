package module21.Functionalinterface;

import java.util.Arrays;
import java.util.List;

interface F12{
	int add(int a, int b);
}
public class methodReference {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F12 obj1 = (a,b) -> a+b;
		System.out.println("Using lambda exp : "+obj1.add(20,30));
		
		F12 obj2 = Integer :: sum;
		System.out.println("Using method reference: "+ obj2.add(20,30));
		
		List<String> names = Arrays.asList("kabir","Devansh","girish","nitish","murali");
		System.out.println("\nNames: "+names);
		System.out.println("Using lambda: ");
		names.forEach(name -> System.out.println(name));
		
		System.out.println("\nUsing method reference");
		names.forEach(System.out::println);
		
		
	}

}
