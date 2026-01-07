/*
 * Write a Java program in ObjectCount.java that:

	Has a static variable count
	
	Constructor increments count
	
	Creates 3 objects inside main()
	
	Prints the value of count
 */
package module11.coreOops;
public class ObjectCount {
	static int count = 0;
	
	ObjectCount() {
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectCount obj1 = new ObjectCount();
		
		ObjectCount obj2 = new ObjectCount();
		
		ObjectCount obj3 = new ObjectCount();

		
		System.out.println(count);

	}

}
