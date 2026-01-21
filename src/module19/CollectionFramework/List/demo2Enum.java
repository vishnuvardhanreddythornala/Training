package module19.CollectionFramework.List;


import java.util.Scanner;

enum Student {
	Aditya,Devansh,Vishnu,Animesh,Mohit,Pawan,Nitish,Kabir;
}
public class demo2Enum {
	public static void main(String[] args) {
		System.out.println("main start");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value: ");
		String find = sc.next();
		Student f = Student.valueOf(find);
		Student[] names = Student.values();
		for(Student name : names) {
			if (f==name) {
				System.out.println(find+" is present "+name.ordinal());
			}
		}
		
		System.out.println("main end");
	}
}
