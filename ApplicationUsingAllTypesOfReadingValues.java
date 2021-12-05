import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.Console;
import java.util.Scanner;

class ApplicationUsingAllTypesOfReadingValues {
	public static void main(String[] args) 	throws IOException{
		// creating Student object
		Student s = new Student();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// reading student name with bf
		System.out.print("Enter Student name :: ");
		s.studentName = bf.readLine();
		
		// reading Student Id wth DataInputStream
		DataInputStream ds = new DataInputStream(System.in);
		System.out.print("Enter Student ID :: ");
		s.studentId = Integer.parseInt(ds.readLine());

		// Providing college name as System Properties
		s.collegeName = System.setProperty("collegeName","MCET");

		// reading studemt email with bf
		System.out.print("Enter Student Email :: ");
		s.studentEmail = bf.readLine();

		// reading branch with properties
		s.branch = System.setProperty("studentBranch","CSE");

		// reading address, gender, mobile with Scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Student Address :: ");
		s.studentAddress  = scan.nextLine();
		System.out.print("Enter Student Gender :: ");
		s.studentGender  = scan.nextLine();
		System.out.print("Enter Student Mobile :: ");
		s.studentMobile  = scan.nextLong();

		// reading using Console
		Console cns = System.console();
		System.out.print("Enter Student Password :: ");
		s.studentPassword = new String(cns.readPassword());

		// values entered
		System.out.println("Student Name :: " + s.studentName);
		System.out.println("Student ID :: " + s.studentId);
		System.out.println("Student Email :: " + s.studentEmail);
		System.out.println("Student Password :: " + s.studentPassword);
		System.out.println("Student Address :: " + s.studentAddress);
		System.out.println("Student Mobile :: " + s.studentMobile);
		System.out.println("Student Gender :: " + s.studentGender);
		System.out.println("Student Branch :: " + s.branch);
		System.out.println("Student College Name :: " + s.collegeName);
	} // main
} // class
