import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class WorkingWithSystemProperties {
	public static void main(String[] args) throws IOException	{
		// get the System properties from JVM
		String val1 = System.getProperty("val1");
		System.out.println("val1 :: " + val1);

		// Setting values to the System properties
		System.out.println("Enter the two prop....");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.setProperty("val2",br.readLine());
		System.setProperty("val3",br.readLine());
		System.out.println("val2 :: " + System.getProperty("val2"));
		System.out.println("val3 :: " + System.getProperty("val3"));
	} // main
} // class
