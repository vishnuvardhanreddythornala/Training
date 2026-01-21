package module19.CollectionFramework.List;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class demoComparable {
	 public static void main(String[] args){
	        List<Employee> al = new ArrayList<Employee>();
	        al.add(new Employee(201,"John",50000));
	        al.add(new Employee(103,"Emma",75000));
	        al.add(new Employee(150,"Liam",62000));
	        al.add(new Employee(120,"Olivia",58000));

	        System.out.println("Employees before sorting:");
	        for(Employee e: al){
	             System.out.println(e);
	        }
	        System.out.println();

	        Collections.sort(al);
	        System.out.println("Employees after sorting:");
	         for(Employee e: al){
	             System.out.println(e);
	        }
	    }
	}

	class Employee implements Comparable<Employee> {

	    int id;
	    String name;
	    double salary;

	    Employee(int id, String name, double salary){
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }
	    public int compareTo(Employee e){
	        return this.id - e.id;
	    }

	    public String toString(){
	        return "Id: "+id +", Name: "+name+", Salary: "+salary;
	    }

}

