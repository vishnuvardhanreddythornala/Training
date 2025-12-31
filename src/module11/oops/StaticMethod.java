// adding and multiplying two numbers.
package module11.oops;

public class StaticMethod {
	static class Calculator{
		// Static method to perform addition
		static int addNumbers(int x , int y) {
			return x + y;
		}
		// Static method to perform multiplication
		static int multiplyNumbers(int x , int y) {
			return x*y;
		}
		void Showmessage(){
			System.out.println("You are inside  a non static method");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int addition = Calculator.addNumbers(20,30);
		int multiplication = Calculator.multiplyNumbers(2,6);
		
		System.out.println("Addition of two Numbers : "+addition);
		System.out.println("Multiplication of two Numbers: "+multiplication);
		
		Calculator cal = new Calculator();
		cal.Showmessage();

	}

}
