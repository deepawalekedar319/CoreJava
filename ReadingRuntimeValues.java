import  java.io.IOException;

class ReadingRuntimeValues {

	public static void main(String[] args) 	throws IOException{

		System.out.println("\t\t\t\tReading runtime values...\n\n");

		// public int read();
		System.out.print("Enter the first value :: " );
		int val1 = System.in.read();

		// Gives the ASCII value of the first byte
		System.out.println("Value 1 ASCII Code is :: " + val1);

		// printing the value as it is
		System.out.println("Value 1 typed is :: " + (char)val1);

		// It just reads only first char... and in order to read two chars we have to enter the
		// read() two times
		int val2 = System.in.read();

		// Gives the ASCII value of the first byte
		System.out.println("Value 2 ASCII Code is :: " + val2);

		// printing the value as it is
		System.out.println("Value 2 typed is :: " + (char)val2);

		// printing the values as it is...
		//String val = ""+ val1 + val2; // it will append with ascii value but we want exact entred value 
		String val = ""+ (char)val1 + (char)val2;
		System.out.println("Value is :: " + val);
		
		/*
		If we press enter after entering the first value then it ll takes up the enter button acsii value and
		include in our program....

		refer :: ReadingRuntimeValue2.java
		*/
	} // main
} // class
