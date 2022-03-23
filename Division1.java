import java.util.*;
class Division1 {
	public static void main(String[] args) 	{
		Scanner scan = new Scanner(System.in);
		while(true){
			try
			{
				System.out.print("Enter first number :: ");
				int a = scan.nextInt();
				System.out.print("Enter second number :: ");
				int b = scan.nextInt();			
				System.out.println("Divison is :: " + a/b);
				break;
			}
			catch (ArithmeticException e){
				System.out.println("Second number cannot be zero ");
			}
			catch (InputMismatchException e){
				System.out.println("Enter only integers ( digits ) ");
				scan.nextLine();
			}
		}
	}
}
