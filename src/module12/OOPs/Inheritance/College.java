package module12.OOPs.Inheritance;

/*
 * college wants to manage different branches of engineers using Java inheritance.
 *
 * Superclass: Engineer
 * Subclass: CSEEngineer
 */

class Engineer {

    // Non-static method
    void work() {
        System.out.println("Engineer is working");
    }
}

class CSEEngineer extends Engineer {

    // Additional method in subclass
    void coding() {
        System.out.println("CSE Engineer is coding");
    }
}

public class College {

    public static void main(String[] args) {

        // Creating object of subclass
        CSEEngineer ref = new CSEEngineer();

        // 🔹 UPCASTING
        // Subclass object assigned to superclass reference
        Engineer e = ref;

        // Calling superclass method using upcasted reference
        e.work();

        // 🔹 DOWNCASTING
        // Converting superclass reference back to subclass
        CSEEngineer cse = (CSEEngineer) e;

        // Calling subclass-specific method
        cse.coding();
    }
}
