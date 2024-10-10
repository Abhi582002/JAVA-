package Package4;

import java.io.*;

import Package2.Employee;
public class SerializationDemo 
{
 public static void main(String[] args) 
 { 
   Employee e1= new Employee(101,"Amit",12000,"Pune");
   try
   {
     FileOutputStream fout= new FileOutputStream("data.txt");
     ObjectOutputStream oos= new ObjectOutputStream(fout);
     oos.writeObject(e1);
     System.out.println("Object serialized successfully");
     
   }
   catch (Exception e) 
   {
     e.printStackTrace();
   }


 }//end main
}//end class
