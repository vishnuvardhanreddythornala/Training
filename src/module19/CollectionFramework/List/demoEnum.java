package module19.CollectionFramework.List;
enum Student_Names {
	Aditya,Devansh,Vishnu,Animesh,Mohit,Pawan,Nitish,Kabir;
}
public class demoEnum  {
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("\n--All values of enum--");
		Student_Names[] students_names = Student_Names.values();
		for(Student_Names name:students_names) {
			System.out.println(name);
		}
		System.out.println("main end");
	}
}