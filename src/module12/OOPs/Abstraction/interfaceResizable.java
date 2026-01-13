package module12.OOPs.Abstraction;

/*
 * Q.  Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.


### Explanation:

1. **Resizable Interface:**
   - The `Resizable` interface is defined with two methods: `resizeWidth(int width)` and `resizeHeight(int height)`.

2. **Rectangle Class:**
   - The `Rectangle` class implements the `Resizable` interface.
   - It has private fields `width` and `height` to store the dimensions of the rectangle.
   - The class constructor initializes these fields.
   - Getter methods `getWidth()` and `getHeight()` are provided to access the dimensions.
   - The `resizeWidth` and `resizeHeight` methods are overridden to update the dimensions of the rectangle and print the new dimensions.
   - The `toPrint` method is to return a string representation of the rectangle's dimensions.

3. **Main Class:**
   - In the `main` method, a `Rectangle` object is created with initial dimensions.
   - The initial dimensions are printed.
   - The `resizeWidth` and `resizeHeight` methods are called to change the dimensions.
   - The updated dimensions are printed.
 */

interface Resizable{
	 void resizeWidth(int width);
	 void resizeHeight(int height);
}

class Rectangle implements Resizable{
	private int width;
	private int height;
	
	@Override
	public void resizeWidth(int width) {
		this.width = width;
		System.out.println("Width resized to: "+width);
	}
	@Override
	public void resizeHeight(int height) {
		this.height = height;
		System.out.println("Height resized to: "+height);
	}
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	

	
	void toPrint() {
		 System.out.println("Rectangle [Width = " + width + ", Height = " + height + "]");
	}
	
}
public class interfaceResizable {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle(20,30);
		r.toPrint();
		
		r.resizeWidth(10);
		r.resizeHeight(15);
		
		r.toPrint();
		
		

	}

}
