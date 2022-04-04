package p1;
import p2.*;
// 1st way
public class WaysForDefiningJavaClass {
    // class A{
    //     public static void m1() {
    //         System.out.println("WaysForDefiningJavaClass.A.m1() :: From Class Local Inner Class");
    //     }
    // }
    public static void main(String[] args) {
        // class A{
        //     public static void m1() {
        //         System.out.println("WaysForDefiningJavaClass.main(...).A.m1() :: From method Local Inner Class");
        //     }
        // }
        A.m1();
    }
    
}

// class A{
//     public static void m1() {
//         System.out.println("A.m1() :: From Outer Class ");
//     }
// }
