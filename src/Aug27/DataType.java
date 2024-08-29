package Aug27;

public class DataType {
    int e,f,g=30;
    static int x=10;
    static boolean y=true;
    static char z='a';
    static float a=10.98f;
    static double b=30.99876;
    static byte c=127;
    static short s=12873;
    static long l=1234567890123456789L;
    static int d=++c;

    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(l);
        System.out.println(d);
        System.out.println(Long.SIZE/8);
}
}