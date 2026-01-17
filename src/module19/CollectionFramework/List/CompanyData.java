package module19.CollectionFramework;
/*
 * 
/*
 * you are given a java program that defines two classes: Employees and company. 
 * The employee class has attributes for employees id, name, and salary. It also contains a static method to create
 *  new employee objects and a method to display employee details.
 *  
 * The company class maintains a list of employees and displays their details.
 * 
 */

import java.util.ArrayList;

public class CompanyData {

    public static void main(String[] args) {
        Company company = new Company();
        Employees e1 = new Employees(1, "Ram", 30000);
        Employees e2 = new Employees(2, "Sita", 35000);
        Employees e3 = new Employees(3, "Ravi", 40000);
        company.addEmployee(e1);
        company.addEmployee(e2);
        company.addEmployee(e3);
        company.showEmployees();
    }
}
class Employees {
    int empId;
    String name;
    double salary;

    Employees(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(empId + " " + name + " " + salary);
    }
}
class Company {

    ArrayList<Employees> list = new ArrayList<>();

    void addEmployee(Employees emp) {
        list.add(emp);
    }

    void showEmployees() {
        for (Employees emp : list) {
            emp.display();
        }
    }
}

