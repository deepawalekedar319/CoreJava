import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class BRExample {
	public static void main(String[] args) 	throws IOException{
		// Working with BuffredReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter value :: ");
		String val1 = br.readLine();
		System.out.println("Value is :: " + val1); 
	} // main
} // class
