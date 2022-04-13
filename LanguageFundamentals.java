public class LanguageFundamentals {
    public static void main(String[] args) {
        try {
            System.out.println(LFAddition.add(12, -12));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }        
    }
}
