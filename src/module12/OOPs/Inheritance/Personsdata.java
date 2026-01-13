package module12.OOPs.Inheritance;
/*
 * 1. Create a base class Person with method:
	showRole() → prints "I am a person"

2. Create two child classes:
	Student extends Person
	Teacher extends Person

3. Create two interfaces:
	Sports → method play()
	Cultural → method perform()

4. Create a class CollegeStudent that:
	Extends Student
	Implements both Sports and Cultural

5. In main():
	Create object of CollegeStudent
	Call all methods
 */

class Person{
	public void showRole() {
		System.out.println("I am a person");
	}
}
class Student extends Person{
	public void study() {
        System.out.println("I am a student");
    }
	
}
class Teacher extends Person{
	   public void teach() {
	        System.out.println("I am a teacher");
	    }
}

interface Sports{
	public void play();
}
interface Cultural{
	public void perform();
}

class CollegeStudent extends Student implements Sports, Cultural{
	public void play() {
		System.out.println("College student plays sports");
	}
	public void perform() {
		System.out.println("College student perform cultural activities");
	}
}

public class Personsdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollegeStudent cs = new CollegeStudent();
		cs.showRole();
		cs.study();
		cs.play();
		cs.perform();

	}

}
