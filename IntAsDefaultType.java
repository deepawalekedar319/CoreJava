public class IntAsDefaultType {
    public static void main(String[] args) {
        // approach #1
        //boolean b = 10;

        // approach #2
        m1(10);
    } // main
    public static void m1(int x) {
        System.out.println("int method");
    }
    public static void m1(byte x) {
        System.out.println("byte method");
    }
    
    public static void m1(short x) {
        System.out.println("short method");
    }
    
    public static void m1(long x) {
        System.out.println("long method");
    }
} // class