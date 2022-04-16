public class EvenOddClass {
    public static String isEvenOdd(int x) throws IllegalArgumentException{
        if(x%2!=0){
            throw new IllegalArgumentException("Enter only even number...");
        }
        return "Given number " + x + " is even.." ;
    }
}
