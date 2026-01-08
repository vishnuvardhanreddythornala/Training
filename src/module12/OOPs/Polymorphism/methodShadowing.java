package module12.OOPs.Polymorphism;

// Parent class
class Parent {

    // Static methods (can be hidden, not overridden)
    public static void test() {
        System.out.println("Parent class test method");
    }

    public static void demo(int a) {
        System.out.println("Parent class demo method");
    }
}

// Child class
class Child extends Parent {

    // Static methods with same signature → METHOD HIDING
    public static void test() {
        System.out.println("Child class test method");
    }

    public static void demo(int a) {
        System.out.println("Child class demo method");
    }
}

// Main class
public class methodShadowing {

    public static void main(String[] args) {

        System.out.println("Main starts\n");

        System.out.println("--- Parent object ---");
        Parent.test();
        Parent.demo(10);

        System.out.println("\n--- Child object ---");
        Child.test();
        Child.demo(20);

        System.out.println("\n--- Upcasting ---");
        Parent.test();
        Parent.demo(30);

        System.out.println("\n--- Downcasting ---");
        Child.test();
        Child.demo(40);


        System.out.println("\nMain ends");
    }
}
