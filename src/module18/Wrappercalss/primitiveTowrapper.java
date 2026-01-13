package module18.Wrappercalss;

// WAJP to convert each primitive datatype into wrapper class
public class primitiveTowrapper {

    public static void main(String[] args) {

        /*
         * byte    -> Byte
         * short   -> Short
         * int     -> Integer
         * long    -> Long
         * float   -> Float
         * double  -> Double
         * char    -> Character
         * boolean -> Boolean
         */

        // -------- byte --------
        byte b = 10;
        Byte B1 = b; // implicit (autoboxing)
        System.out.println("Byte Implicit boxing: " + B1);

        Byte B2 = Byte.valueOf(b); // explicit
        System.out.println("Byte Explicit boxing: " + B2);

        // -------- short --------
        short s = 20;
        Short S1 = s;
        System.out.println("Short Implicit boxing: " + S1);

        Short S2 = Short.valueOf(s);
        System.out.println("Short Explicit boxing: " + S2);

        // -------- int --------
        int i = 30;
        Integer I1 = i;
        System.out.println("Integer Implicit boxing: " + I1);

        Integer I2 = Integer.valueOf(i);
        System.out.println("Integer Explicit boxing: " + I2);

        // -------- long --------
        long l = 40L;
        Long L1 = l;
        System.out.println("Long Implicit boxing: " + L1);

        Long L2 = Long.valueOf(l);
        System.out.println("Long Explicit boxing: " + L2);

        // -------- float --------
        float f = 50.5f;
        Float F1 = f;
        System.out.println("Float Implicit boxing: " + F1);

        Float F2 = Float.valueOf(f);
        System.out.println("Float Explicit boxing: " + F2);

        // -------- double --------
        double d = 60.60;
        Double D1 = d;
        System.out.println("Double Implicit boxing: " + D1);

        Double D2 = Double.valueOf(d);
        System.out.println("Double Explicit boxing: " + D2);

        // -------- char --------
        char c = 'A';
        Character C1 = c;
        System.out.println("Character Implicit boxing: " + C1);

        Character C2 = Character.valueOf(c);
        System.out.println("Character Explicit boxing: " + C2);

        // -------- boolean --------
        boolean flag = true;
        Boolean Bn1 = flag;
        System.out.println("Boolean Implicit boxing: " + Bn1);

        Boolean Bn2 = Boolean.valueOf(flag);
        System.out.println("Boolean Explicit boxing: " + Bn2);
    }
}
