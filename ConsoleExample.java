import java.io.Console;

class ConsoleExample {
	public static void main(String[] args) 	{
		Console cns = System.console();
		System.out.print("Enter Username :: ");
		String username = cns.readLine();
		System.out.print("Enter Password :: ");
		char[] password = cns.readPassword();
		System.out.println("Username :: " + username + "\nPassword :: "  + new String(password));
	} // main
} // class
