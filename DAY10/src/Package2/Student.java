package Package2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

class Student
{
    private int studentId;
    private String name;
    private double marks;

    public Student(int studentId, String name, double marks) 
    {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }


    public int getStudentId() 
    {
        return studentId;
    }

    public void setStudentId(int studentId) 
    {
        this.studentId = studentId;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getMarks() 
    {
        return marks;
    }

    public void setMarks(double marks) 
    {
        this.marks = marks;
    }

    @Override
    public String toString() 
    {
        return "Student [ID=" + studentId + ", Name=" + name + ", Marks=" + marks + "]";
    }
}

