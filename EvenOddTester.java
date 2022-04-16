public class EvenOddTester {
    public static void main(String[] args) {
        try {
            System.out.println(EvenOddClass.isEvenOdd(110));            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }        
    }
}
