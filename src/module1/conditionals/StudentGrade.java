/*
 * write a java program to calculate and display the grade of a student based on the marks obtained?
		    Marks >= 90 -- grade A 
		    Marks >= 75 and  < 90 -- grade B 
		    Marks >= 60 and <75 -- grade C 
		    Marks >= 40 and < 60 -- grade D 
		    Marks < 40 -- fail

		    if marks are invalid print invalid marks
		    
 */
package module1.conditionals;
import java.util.Scanner;

public class StudentGrade {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the marks :");
		        int marks = sc.nextInt();

		        if (marks >= 90) {
		            System.out.println(marks + "-- Student Obtained A Grade");
		        } else if (marks >= 75 && marks < 90) {
		            System.out.println(marks + "-- Student obtained B Grade");
		        } else if (marks >= 60 && marks < 75) {
		            System.out.println(marks + "-- Student obtained C Grade");
		        } else if (marks >= 40 && marks < 60) {
		            System.out.println(marks + "-- Student obtained D Grade");
		        } else if (marks < 40) {
		            System.out.println(marks + "-- Student failed");
		        } else {
		            System.out.println("Invalid marks");
		        }
		        sc.close();
		    }

		}

