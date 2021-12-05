import  java.io.IOException;

class ReadingRuntimeValues2 {

	public static void main(String[] args) 	throws IOException{

		System.out.println("\t\t\t\tReading runtime values...\n\n");

		// public int read();
		System.out.print("Enter the first value :: " );
		//int val1 = System.in.read();

		//System.out.print("Enter the second value :: " );
		//int val2 = System.in.read();
		// It is taking enter ascii value also.. and we cannot enter the next value bsc enter value is already 
		// present in buffer....
		//System.out.println(val1 + "   " + val2);
		// Above problem can be solve by taking our own function in while loop 

		String val1 = readLine();
		System.out.println(val1);
	} // main

	// reading values
	public static String readLine() throws IOException{
		String data = "";
		int a;
		while((a=System.in.read())!=13){
			data += (char)a;
		} // while
		return data;
	} // method
} // class
