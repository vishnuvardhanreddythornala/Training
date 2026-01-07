/*
 * Create a  java class named Student1 with the following requirements:
 * 1. instance variables:
 * int id
 * String name
 * int[] marks (size3)
 * 
 * 2. create: 
 * A parameterized constructor to initialize all variables
 * A copy  constructor that creates a deep copy of a student object
 * 
 * 3.In the main method:
 * create one student object using the parameterized constructor
 * create another student object using the copy constructor
 * modify the marks of the copied object
 * print details of both the objects.
 * 
 */
package module11.coreOops;

public class Student1 {
	int id;
	String name;
	int[] marks;
	
	public Student1(int id, String name, int[] marks) {
		this.id = id;
		this.name = name;
		
		//creating a new array
		this.marks = new int[3];
		for(int i = 0; i<marks.length; i++) {
			this.marks[i] = marks[i];
			
		}
		
	}
	
	public Student1(Student1 obj) {
		this.id = obj.id;
		this.name = obj.name;
		
		//deep copy of array
		this.marks = new int[3];
		for(int i = 0; i<obj.marks.length; i++) {
			this.marks[i] = obj.marks[i];
		}
		
	}
	

    // Method to print all student details
    void printDetails() {
        System.out.print("ID: " + id + ", Name: " + name + ", Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] m1 = {70, 80, 90};

        // Original object
        Student1 s1 = new Student1(1, "Vishnu", m1);

        // Copied object
        Student1 s2 = new Student1(s1);

        // Update copied object's marks
        s2.marks[0] = 10;
        s2.marks[1] = 20;
        s2.marks[2] = 30;

        // Print both objects
        System.out.println("Original Student:");
        s1.printDetails();

        System.out.println("Copied Student:");
        s2.printDetails();
		

	}

}
