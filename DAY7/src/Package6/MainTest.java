package Package6;

class SPCollege  implements GradeA
{
	
}
class FCCollege
{
	
}

public class MainTest 
{
 public static void main(String[] args) 
 {
     SPCollege ob1= new SPCollege();
     FCCollege ob2= new FCCollege();
     
     if(ob1 instanceof GradeA)
     {
    	 System.out.println("sp college is grade A ...");
     }
     if(ob2 instanceof GradeA)
     {
    	 System.out.println("fc college is grade A ...");
     }
 }
}