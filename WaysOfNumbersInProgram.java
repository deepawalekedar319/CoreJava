class WaysOfNumbersInProgram{
    public static void main(String[] args) {
        // #1st storing a varibale
        int a = 10;

        // #2nd passing as method argument
        int b = getVar(10);

        // #3d printing 
        System.out.println(10);

        // #5th using in expressions
        int c = a + b;
    }
    // #4th returning from method
    public static int getVar(int x) {
        return x;
    }
}