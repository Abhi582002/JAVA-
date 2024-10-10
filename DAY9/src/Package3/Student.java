package Package3;

import java.util.Scanner;

public class Student 
{
	private int studentId;
	private String studentName;
	private int studentAge;
	
	public Student()
	{
		this.studentId = 0;
		this.studentName = "ABHI";
		this.studentAge = 22;
	}
	
	public void acceptData()throws NameException,AgeException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Student Id :");
		studentId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter The Student Name:");
		studentName = sc.nextLine();
		try {
		if(studentName.length() <2 )
		{
			throw new NameException();
		}
		
		 System.out.println("Enter Student Age:");
	     studentAge = sc.nextInt();
	     
	     if (studentAge > 18)
	     {  
	    	 throw new AgeException();
	     }
		}catch(NameException | AgeException e) 
		{
			e.printStackTrace();
		}
	}
	 public void displayData() 
	 {
	        System.out.println("\nStudent Details:");
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Student Name: " + studentName);
	        System.out.println("Student Age: " + studentAge);
	 }

	}



	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
