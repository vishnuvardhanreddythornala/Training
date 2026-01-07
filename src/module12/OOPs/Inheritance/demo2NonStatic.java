package module12.OOPs.Inheritance;

class Parent {
    int a = 10;

    public void test() {
        System.out.println("Parent class non-static method");
    }

    {
        System.out.println("IIB Parent class");
    }

    public Parent() {
        System.out.println("Parent class Constructor");
    }
}

class son extends Parent {
    int b = 20;

    public void test2() {
        System.out.println("Son class non-static method");
    }

    {
        System.out.println("IIB Son class");
    }

    public son() {
        System.out.println("Son class Constructor");
    }
}

public class demo2NonStatic {

    static {
        System.out.println("SIB Driver class");
    }

    public static void main(String[] args) {
        son ref1 = new son();
    }
}
