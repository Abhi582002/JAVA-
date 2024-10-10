package Package3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student 
{
    private int studentId;
    private String name;
    private int rollno;

    public Student(int studentId, String name, int rollno) 
    {
        this.studentId = studentId;
        this.name = name;
        this.rollno = rollno;
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

    public int getRollno() 
    {
        return rollno;
    }

    public void setRollno(int rollno) 
    {
        this.rollno = rollno;
    }

    @Override
    public String toString() 
    {
        return "Student [ID=" + studentId + ", Name=" + name + ", Rollno=" + rollno + "]";
    }
}


