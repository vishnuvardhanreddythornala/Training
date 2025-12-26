//method overloading

package module8.methods;

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans1 = calculateArea(4);
		System.out.println("Area of square: "+ans1);
		double ans2 = calculateArea(3.0);
		System.out.println("Area of circle: "+ans2);
		int ans3 = calculateArea(4,3);
		System.out.println("Area of rectangle: "+ans3);
		
		

	}
	public static int calculateArea(int side) {
		int areaofsq = side*side;
		return areaofsq;
	}
	public static double calculateArea(double radius) {
		double areaofcir = 3.14159 * radius*radius;
		return areaofcir;
	}
	public static int calculateArea(int length, int breadth) {
		int areaofrec = length * breadth;
		return areaofrec;
	}

}
