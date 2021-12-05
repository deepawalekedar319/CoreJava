import java.io.DataInputStream;
import java.io.IOException;

class DISExample {
	public static void main(String[] args) 	 throws IOException{
		// As alternative to read() we have the same readLine() in 
		// DataInputStream
		DataInputStream ds = new DataInputStream(System.in);
		System.out.print("Enter the first number ");
		String val1 = ds.readLine();
		System.out.println("Entered value is :: " + val1); 

		// The problem with DataInputStream is it will accept only one byte of data
		// but if we using any other languages then we will have two bytes of data for each char..
		// so the alternate is working with BufferedReader
	} // main
} // class
