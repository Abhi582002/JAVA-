//import java.util.Scanner;
//
//public class Student {
//    // Private members
//    private String studentId;
//    private String studentName;
//    private String studentAddress;
//    private String collegeName;
//
//    // Constructor
//    public Student(String studentId, String studentName, String studentAddress, String collegeName) {
//        this.studentId = studentId;
//        this.studentName = studentName;
//        this.studentAddress = studentAddress;
//        this.collegeName = collegeName;
//    }
//    
//    public Student(String studentId, String studentName, String studentAddress) {
//        this.studentId = studentId;
//        this.studentName = studentName;
//        this.studentAddress = studentAddress;
//        collegeName = "Abc Tecnical Institute";
//
//    }
//    
//    // Getter for studentId
//    public String getStudentId() {
//        return studentId;
//    }
//
//    // Setter for studentId
//    public void setStudentId(String studentId) {
//        this.studentId = studentId;
//    }
//
//    // Getter for studentName
//    public String getStudentName() {
//        return studentName;
//    }
//
//    // Setter for studentName
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//    // Getter for studentAddress
//    public String getStudentAddress() {
//        return studentAddress;
//    }
//
//    // Setter for studentAddress
//    public void setStudentAddress(String studentAddress) {
//        this.studentAddress = studentAddress;
//    }
//
//    // Getter for collegeName
//    public String getCollegeName() {
//        return collegeName;
//    }
//
//    // Setter for collegeName
//    public void setCollegeName(String collegeName) {
//        this.collegeName = collegeName;
//    }
//
//    // Method to display student details
//    public void displayStudentDetails() {
//        System.out.println("Student ID: " + studentId);
//        System.out.println("Student Name: " + studentName);
//        System.out.println("Student Address: " + studentAddress);
//        System.out.println("College Name: " + collegeName);
//    }
//
//    // Main method for testing
//    public static void main(String[] args) {
//        // Create a Scanner object to get input from the user
//        Scanner scanner = new Scanner(System.in);
//
//        // Get input from the user
//        System.out.print("Enter Student ID: ");
//        String studentId = scanner.nextLine();
//
//        System.out.print("Enter Student Name: ");
//        String studentName = scanner.nextLine();
//
//        System.out.print("Enter Student Address: ");
//        String studentAddress = scanner.nextLine();
//
//        System.out.print("Are you from abip institude /'Yes,No'");
//        String clg = scanner.nextLine();
//          if(clg.equalsIgnoreCase("yes")) {
//        // Create a new Student object using the user input
//        Student student = new Student(studentId, studentName, studentAddress);
//        System.out.println("\nStudent Details:");
//        student.displayStudentDetails();
//
//          }
//          else {
//        	  System.out.println("Enter the College Name:");
//        	  String collegeName = scanner.nextLine();
//        	  
//        	  Student student = new Student(studentId, studentName, studentAddress,collegeName);
//        	  System.out.println("\nStudent Details:");
//              student.displayStudentDetails();
//          }
//              
//        // Close the scanner
//        scanner.close();
//    }
//}


import java.util.Scanner;

public class Student
{
	private String studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;


public Student(String studentId,String studentName,String studentAddress,String collegeName)
{
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
	this.collegeName = collegeName;
}

public Student(String studentId,String studentName,String studentAddress)
{
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
	this.collegeName = "Abc Tecnical Institute"; 
}

public String getStudentId() 
{
  return studentId;
}

public void setStudentId(String studentId) 
{
  this.studentId = studentId;
}

public String getstudentName()
{
	return studentName;
}

public void setstudentName(String studentName)
{
	this.studentName = studentName;
}

public String getstudentAddress()
{
	return studentAddress;
}

public void setstudentAddress(String studentAddress)
{
	this.studentAddress = studentAddress;
}

public String getCollegeName() 
{
  return collegeName;
}

public void setCollegeName(String collegeName) 
{
  this.collegeName = collegeName;
}

public void displayStudentDetails() 
{
  System.out.println("Student ID: " + studentId);
  System.out.println("Student Name: " + studentName);
  System.out.println("Student Address: " + studentAddress);
  System.out.println("College Name: " + collegeName);
}

public static void main(String []args)
{
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter The Student Id:");
	  String studentId = sc.nextLine() ;
	  
	  System.out.println("Enter The Student Name:");
	  String studentName = sc.nextLine();
	  
	  System.out.println("Enter The Student Address:");
	  String studentAddress = sc.nextLine();
	  
	  System.out.print("Are you from abip institude /'Yes,No'");
	  String clg = sc.nextLine();
	  if(clg.equalsIgnoreCase("yes"))
		{
		  Student student = new Student(studentId, studentName, studentAddress);
		  System.out.println("\nStudent Details:");
		  student.displayStudentDetails();
		}
	  else
	  {
		  System.out.println("Enter the College Name:");
    	  String collegeName = sc.nextLine();
    	  Student student = new Student(studentId, studentName, studentAddress,collegeName);
    	  
    	  System.out.println("\nStudent Details:");
          student.displayStudentDetails();
	  }
          sc.close();
	  }
}


































