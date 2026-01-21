package module22.RegularExpressions;

public class demoRegularexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Expressions e = new Expressions();
	        e.dot();
	        e.plus();
	        e.star();
	        e.question();
	}
	 
}
class Expressions{
	//. = Matches any single character except newline.
	public void dot() {

		System.out.println("----Dot----");	
		System.out.println("Suraj".matches("S...j"));
		System.out.println("Suraj".matches("S..j"));
		System.out.println("Sraj".matches("S...j"));
		System.out.println("suraj".matches("S...j"));
		System.out.println("Siraj".matches("S...j"));
		System.out.println("Sairaj".matches("S...j"));
		System.out.println("S123j".matches("S...j"));
		System.out.println();	
		
	}
	//+ = Matches one or more occurrence of the previous character or pattern
	public void plus() {
		System.out.println("----Plus----");	
		System.out.println("Sabcj".matches("S+j"));
		System.out.println("Sxxj".matches("S+j"));
		System.out.println("Sj".matches("S+j"));
		System.out.println("SSj".matches("S+j"));
		System.out.println("Sjj".matches("Sj+"));
		System.out.println("SSSj".matches("S+j"));
		System.out.println();	
	}
	//* = Matches zero or more occurences of the previous character or pattern
	public void star() {
		System.out.println("----Star----");	
		System.out.println("Sabcj".matches("S*j"));
		System.out.println("xxj".matches("S*j"));
		System.out.println("Sj".matches("S*j"));
		System.out.println("SSj".matches("S*j"));
		System.out.println("Sjj".matches("S*j"));
		System.out.println("SSSj".matches("S*j"));
		System.out.println();	
	}
	public void question() {
		System.out.println("----Question----");	
		System.out.println("colr".matches("colo?r"));
		System.out.println("color".matches("colo?r"));
		System.out.println("coloor".matches("colo?r"));
		System.out.println("abc".matches("ab(c)?"));
		System.out.println("ab".matches("ab(c)?"));
		System.out.println("abcd".matches("ab(c)?"));
		System.out.println();	
	}
}
