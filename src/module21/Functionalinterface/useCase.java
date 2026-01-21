package module21.Functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {

    int id;
    String name;
    double marks;

    Students(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }

    // Sorting by ID (Natural Order)
    @Override
    public int compareTo(Students s) {
        return this.id - s.id;
    }
}

public class useCase {

    public static void main(String[] args) {

        List<Students> st = new ArrayList<>();

        st.add(new Students(3, "Murali", 75.5));
        st.add(new Students(4, "Aditya", 85.5));
        st.add(new Students(1, "Vishnu", 80.5));
        st.add(new Students(2, "Pramod", 90.5));
        st.add(new Students(2, "Suraj", 55.5));

        // Original List
        System.out.println("Original List");
        for (Students s : st) {
            System.out.println(s);
        }

        // Sort by ID
        Collections.sort(st);
        System.out.println("\n-- Sorted by ID --");
        for (Students s : st) {
            System.out.println(s);
        }

        // Sort by Name (Lambda)
        Collections.sort(st, (s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("\n-- Sorted by Name --");
        for (Students s : st) {
            System.out.println(s);
        }

        // Sort by Marks (Lambda - Simple if/else)
        Collections.sort(st, (s1, s2) -> {
            if (s1.marks > s2.marks)
                return 1;
            else if (s1.marks < s2.marks)
                return -1;
            else
                return 0;
        });

        System.out.println("\n-- Sorted by Marks --");
        for (Students s : st) {
            System.out.println(s);
        }
    }
}
