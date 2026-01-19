package module19.CollectionFramework.Queue;
//
//Q. WAJP to manage employee salary details using map.
//1. add atleast 6 employee records 
//2. print only those employees whose salary  is greater than 50000

import java.util.Map;
import java.util.HashMap;

public class EmployeeSalary {

    public static void main(String[] args) {

        // Step 1: Create Map to store Employee ID and Salary
        Map<Integer, Double> empSalary = new HashMap<>();

        // Step 2: Add at least 6 employee records
        empSalary.put(101, 45000.0);
        empSalary.put(102, 52000.0);
        empSalary.put(103, 61000.0);
        empSalary.put(104, 48000.0);
        empSalary.put(105, 75000.0);
        empSalary.put(106, 50000.0);

        // Step 3: Print employees whose salary is greater than 50000
        System.out.println("Employees with salary greater than 50000:");

        for (Map.Entry<Integer, Double> entry : empSalary.entrySet()) {
            if (entry.getValue() > 50000) {
                System.out.println("Employee ID: " + entry.getKey() +
                                   ", Salary: " + entry.getValue());
            }
        }
    }
}

