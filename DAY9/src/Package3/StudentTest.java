//Write a Program of JAVA create class Student with member fields student id ,student name,student age and member methods
//default Constructor,acceptdata,displaydata
//if name is not Valid then raise NameException.
//if age is >18 then raise AgeException 

package Package3;

public class StudentTest 
{
	 public static void main(String[] args)
	 {
		  Student s = new Student();
		  try {
			  s.acceptData();
		  }catch(NameException | AgeException e)
		  {
			  e.printStackTrace();
		  }
		 
		  s.displayData();
	 }
}
