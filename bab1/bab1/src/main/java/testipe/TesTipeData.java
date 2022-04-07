package testipe;

/**
 *
 * @author niken riri
 */
public class TesTipeData {
    public static void main(String[] args) {
        byte b = 1;
        short s = 100;
        int i = 1000;
        long l = 10000;
        char c = 'a';
        float f = 3.14f;
        double d = 3.14;
        boolean t = true;
        final double PHI = 3.14;
        
        System.out.println("byte " + b);
        System.out.println("short " + s);
        System.out.println("int " + i);
        
        i = 010;
        System.out.println("int " + i + " octal mode");
        i = 0xFF;
        System.out.println("int " + i + " hexa mode");
        
        System.out.println("long " + l);
        System.out.println("char " +c);
        System.out.println("float " + f);
        System.out.println("double " + d);
        System.out.println("boolean " + t);
        System.out.println("phi " + PHI);
    }
    
}
