//Sorting by Name And Roll Number...


package Package3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManagement 
{

    public static void main(String[] args) 
    {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        studentList.add(new Student(10,"ABHI",78));
        studentList.add(new Student(5, "Tejas", 45));
        studentList.add(new Student(2, "Yash", 86));
        studentList.add(new Student(9, "Varad", 7));
        
        System.out.println("List of Students before sorting:");
        for (Student s : studentList) 
        {
            System.out.println(s);
        }

        Collections.sort(studentList, new Comparator<Student>() 
        {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getRollno(), s2.getRollno());
            }
        }
        		
       );

      
        System.out.println("\nList of Students sorted by Roll Number:");
        for (Student s : studentList) 
        {
            System.out.println(s);
        }

  
        Collections.sort(studentList, new Comparator<Student>() 
        {
            @Override
            public int compare(Student s1, Student s2) 
            {
            return s1.getName().compareToIgnoreCase(s2.getName());
            }
        });

        
        System.out.println("\nList of Students sorted by Name:");
        for (Student s : studentList) 
        {
            System.out.println(s);
        }

        sc.close();
    }
}