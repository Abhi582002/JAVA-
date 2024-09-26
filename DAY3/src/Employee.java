
import java.util.Scanner;
public class Employee 
{
 int eid;    
 String ename;
 int esal;
 static int count;
 static 
 { 
   count=0;
 }
 public Employee() 
 {
   eid=0;
   ename=null;
   esal=0;
   count++;
 }
 Employee(int eid,String ename,int esal)
 {
	this.eid=eid;
	this.ename=ename;
	this.esal=esal;
	count++;
 }
 public void accept()
 {
  Scanner sc=new Scanner(System.in);	 
  System.out.println("Employee Id:");
  eid=sc.nextInt();
  System.out.println("Employee Name:");
  ename=sc.next();
  System.out.println("Employee Salary:");
  esal=sc.nextInt();
 }
 public void display()
 {
  System.out.println("Employee Id:"+eid);
  System.out.println("Employee Name:"+ename);
  System.out.println("Employee Salary:"+esal);
 }
 public static void displayCnt()
 {
   System.out.println("Employee Count:"+count);
 }
 public static void main(String[] args) 
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("\nHowmany employees?:");
  n=sc.nextInt();
  Employee emp[]=new Employee[n];
  System.out.println("Enter the Employee Details:");
  for(int i=0;i<n;i++)
  {
	emp[i]=new Employee();
	emp[i].accept();
  }
  System.out.println("\n\nEmployee Details are:");
  for(int i=0;i<n;i++)
  {
	emp[i].display();
  } 
  
 }
}