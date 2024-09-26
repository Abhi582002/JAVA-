public class Test 
{
 public static void display(int n) 
 {
   n=n+10;	
   System.out.println("n value in method:"+n);
 }
 public static void main(String[] args) 
 { 
   int n=20;	 
   System.out.println("n value before:"+n);
   display(n); //pass by value  (primitive type)
   System.out.println("n value after:"+n);
  
 }
}