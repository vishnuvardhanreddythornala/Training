/*
 * static  
	--------------
	1.static variable
	2.static methods
	3.static block
	
   non-static or dynamic
	---------------------
	1.non-static variables
	2.non - static method
	3.non - static block
	4. constructor.
	
 * for execution program JVM have some memory areas
 * 1.class static area: 
	 * Every class will have a dedicated memory to strore all static memebers is known as class static area.
	 * The name of class static area is as same as ClassName
	 * Every static context is directly pointing towards class static area
 * 2.stack area: It is used for execution
 * 3.heap area
 */

package module11.coreOops;

public class staticvariables {
static int a = 10; // static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		System.out.println(a);
		test();
		System.out.println("Main end");

	}
	public static void test() {
		System.out.println("Test method start");
		int a = 30;
		System.out.println(a);
		System.out.println(staticvariables.a);
		System.out.println("Test method end");
	}

}
