public class LFAddition {
    public static int add(int x, int y) throws IllegalArgumentException{
        if(x<0 || y<0){
            throw new IllegalArgumentException("Numbers cannot be negative");
        }
        else{
            return x+y;
        }
    }
}
