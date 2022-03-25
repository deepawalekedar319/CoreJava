import java.util.Scanner;
import java.util.InputMismatchException;
class DivisionTest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while(true){
            try {
                System.out.print("Enter the First number :: ");
                a = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                // handle exception
                System.out.println("Enter only numbers...");
                scan.nextLine();
            }
        }
        while(true){
            try {
                System.out.print("Enter the Second number :: ");
                b = scan.nextInt();
                System.out.println("Divisoin is :: " + a/b);
                break;
            } catch (InputMismatchException e) {
                // handle exception
                System.out.println("Enter only numbers...");
                scan.nextLine();
            }
            catch(ArithmeticException ae){
                System.out.println("Cannot Divide by Zero...");
            }
        }
        scan.close();
    }

}