/*
 * WAJP to create student class consist of 4 data such as:
	id, name , percentage, college name
create parameterized constructor to initialize only id.
-create parameterized constructor to initialize only name.
-create parameterized constructor to initialize only percentage.
-create parameterized constructor to initialize id and name.
-create parameterized constructor to initialize id and percentage.
-create parameterized constructor to initialize name and percentage.
-create parameterized constructor to initialize id , name and percentage.
-create default / no argument constructor to assign default values.
-create one static method called printDetail to print all the details of 
student.
-in main method create objects using all constructors.
 */
package module11.coreOops;

public class Student {
	static String CollegeName = "LPU";
	int id;
	String name;
	double percentage;
	
	
	//parameterized constructor
	public Student(int id) {
		this.id = id;
	}
	public Student(String name) {
		this.name = name;
	}

	public Student(double percentage) {
		this.percentage = percentage;
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Student(int id,double percentage) {
		this.id = id;
		this.percentage = percentage;
	}
	public Student(String name, double percentage) {
		this.name = name;
		this.percentage = percentage;
	}
	public Student(int id, String name,double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	//static method
	public static void PrintDetails(Student s){
		System.out.println("All deatils of a student: ");
		System.out.println("CollegeName: "+ CollegeName);
		System.out.println("Student Id: "+s.id);
		System.out.println("Student name: "+s.name);
		System.out.println("Percentage obtained: "+s.percentage);
		
	}
	//default constructor
	public  Student() {
		 id = 0;
		 name = "Not Assigned";
		 percentage = 0.0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1);
		Student s2 = new Student("vishnu");
		Student s3 = new Student(96);
		Student s4 = new Student(1,"vishnu");
		Student s5 = new Student(1,96);
		Student s6 = new Student("vishnu",96);
		Student s7 = new Student(1,"vishnu",96);
		
		PrintDetails(s1);
		PrintDetails(s2);
		PrintDetails(s3);
		PrintDetails(s4);
		PrintDetails(s5);
		PrintDetails(s6);
		PrintDetails(s7);

	}

}
