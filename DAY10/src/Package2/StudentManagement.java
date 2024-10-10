package Package2;


import java.util.ArrayList; 
import java.util.Iterator;
import java.util.Scanner;


public class StudentManagement 
{

    public static void main(String[] args) 
    {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
      
        studentList.add(new Student(1, "Tejas", 85.5));
        studentList.add(new Student(2, "Yash", 90.0));
        studentList.add(new Student(3, "Varad", 78.0));
        
        for(Student s1 : studentList) {
        	System.out.print(s1.getStudentId()+" ");
        	System.out.print(s1.getName()+" ");
        	System.out.print(s1.getMarks());
        	System.out.println();
        }
        
        System.out.println("\nEnter Student ID to search:");
        int searchId = sc.nextInt();
        boolean found = false;
        for (Student s2 : studentList) 
        {
            if (s2.getStudentId() == searchId) 
            {
                System.out.println("Student Found: " + s2);
                found = true;
                break;
            }
        }
        if (!found) 
        {
            System.out.println("Student with ID " + searchId + " not found.");
        }
        
        System.out.println("\nEnter Student ID to delete:");
        int deleteId = sc.nextInt();
        found = false;
        for (Student s1 : studentList) 
        {
            if (s1.getStudentId() == deleteId) 
            {
                studentList.remove(s1);
                System.out.println("Student with ID " + deleteId + " deleted.");
                found = true;
                break;
            }
        }
        if (!found) 
        {
            System.out.println("Student with ID " + deleteId + " not found.");
        }

        System.out.println("\nList of Students after deletion:");
        for (Student s : studentList) 
        {
            System.out.println(s);
        }                  
        sc.close();
    }
}

