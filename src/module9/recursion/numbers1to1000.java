//write a java program to print all the numbers from range 1 to 1000 without using loops
package module9.recursion;

	public class numbers1to1000 {

	    public static void main(String[] args) {
	        printNumbers(1);
	    }
	    static void printNumbers(int num) {
	        if (num >= 1000) {
	        	System.out.println(num);
	        	 printNumbers(++num); // base condition
	        }
	        
	    }
	}



