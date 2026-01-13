package module18.Wrappercalss;

public class UnBoxing {

    public static void main(String[] args) {

        // -------- Integer --------
        Integer a = 10;
        int i1 = a; // implicit unboxing
        System.out.println("Integer Implicit unboxing: " + i1);

        int i2 = a.intValue(); // explicit unboxing
        System.out.println("Integer Explicit unboxing: " + i2);

        // -------- Byte --------
        Byte B = 20;
        byte b1 = B; // implicit unboxing
        System.out.println("Byte Implicit unboxing: " + b1);

        byte b2 = B.byteValue(); // explicit unboxing
        System.out.println("Byte Explicit unboxing: " + b2);

        // -------- Short --------
        Short S = 30;
        short s1 = S;
        System.out.println("Short Implicit unboxing: " + s1);

        short s2 = S.shortValue();
        System.out.println("Short Explicit unboxing: " + s2);

        // -------- Long --------
        Long L = 40L;
        long l1 = L;
        System.out.println("Long Implicit unboxing: " + l1);

        long l2 = L.longValue();
        System.out.println("Long Explicit unboxing: " + l2);

        // -------- Float --------
        Float F = 50.5f;
        float f1 = F;
        System.out.println("Float Implicit unboxing: " + f1);

        float f2 = F.floatValue();
        System.out.println("Float Explicit unboxing: " + f2);

        // -------- Double --------
        Double D = 60.60;
        double d1 = D;
        System.out.println("Double Implicit unboxing: " + d1);

        double d2 = D.doubleValue();
        System.out.println("Double Explicit unboxing: " + d2);

        // -------- Character --------
        Character C = 'A';
        char c1 = C;
        System.out.println("Character Implicit unboxing: " + c1);

        char c2 = C.charValue();
        System.out.println("Character Explicit unboxing: " + c2);

        // -------- Boolean --------
        Boolean Bn = true;
        boolean flag1 = Bn;
        System.out.println("Boolean Implicit unboxing: " + flag1);

        boolean flag2 = Bn.booleanValue();
        System.out.println("Boolean Explicit unboxing: " + flag2);
    }
}
