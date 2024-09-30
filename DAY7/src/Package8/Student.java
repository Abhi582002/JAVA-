package Package8;
import java.util.Scanner;

class Student 
{
 protected int studId;
 protected String name;
 protected int deptId;

 public Student(int studId, String name, int deptId) 
 {
     this.studId = studId;
     this.name = name;
     this.deptId = deptId;
 }

 public int getStudId()
 {
     return studId;
 }

 public String getName()
 {
     return name;
 }

 public int getDeptId() 
 {
     return deptId;
 }

 public void setStudId(int studId) 
 {
     this.studId = studId;
 }

 public void setName(String name) 
 {
     this.name = name;
 }

 public void setDeptId(int deptId) 
 {
     this.deptId = deptId;
 }
}