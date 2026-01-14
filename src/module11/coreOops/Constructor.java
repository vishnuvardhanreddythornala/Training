/*
 * constructor is a special type of method
 * the name of the constructor is as same as classNmae
 * it is  similar to method but it does not have return type
 * z
 * A return type in programming specifies the data type (like int, string, boolean) of the value that a function or method sends 
 * back to the code that called it after finishing its task, acting like a contract for what data to expect, with void used when no value is returned.
 * 
 * default constructor: if programmer has not written any constructor then by default JVM will add no argument constructor during compile time is known as 
 * default constructor.
 * 
 * Every constructor will have :
 * 1.constructor chaining statement
 *   -super() calling statement
 *   -this() calling statement.
 * 2.PLI - pre loading instructions
 * IIB - Instance initializer block
 * UWS -  user written Statements.
 * 
 * Types of constructor:
 * 1. default constructor: if programmer has not written any constructor then by default JVM will add no argument constructor during compile time is known as 
 * default constructor.
 * 2.Parameterized constructor: stdent.java
 * - A constructor which has formal arguments is known as parameterized constructor.
 * - we use parameterized constructor to initialize non-static variables during object creation.
 * 
 * 3.copy constructor:
 * 
 * 4.private constructor
 */
package module11.coreOops;

public class Constructor {
	public Constructor() {
		//no argument constructor.
		System.out.println("---------- Im constructor-----------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		Constructor obj1 = new Constructor();
		

	}

}
