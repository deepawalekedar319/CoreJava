public class WorkingWithVariables {

    public static void main(String[] args) {

        StudentClass student = new StudentClass();
        student.sno = 10;
        student.name = "D. Kedar Singh";
        student.course = "Java";
        student.avg = 95.5;

        System.out.println("Student Sno :: " + student.sno);
        System.out.println("Student Name :: " + student.name);
        System.out.println("Student Course :: " + student.course);
        System.out.println("Student Average :: " + student.avg);
        
        StudentClass student1 = new StudentClass();
        student1.sno = 20;
        student1.name = "DKS";
        student1.course = "Java";
        student1.avg = 90.5;

        System.out.println("Student Sno :: " + student1.sno);
        System.out.println("Student Name :: " + student1.name);
        System.out.println("Student Course :: " + student1.course);
        System.out.println("Student Average :: " + student1.avg);

    } // main
    
} // class
