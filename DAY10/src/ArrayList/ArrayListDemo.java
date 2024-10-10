package ArrayList;

import java.util.*;
public class ArrayListDemo 
{
 public static void main(String[] args) 
 { 
   ArrayList<String> contries= new ArrayList<String>(); // JDK6
   //ArrayList<String> contries2= new ArrayList<>(); // JDK7
   contries.add("Pakistan");
   contries.add("India");
   contries.add("China");
   contries.add("Nepal");
   contries.add("Afganistan");
   contries.add("Shrilanka");
   contries.add("Bhutan");
   contries.add("Bandladesh");
   contries.add("India");
   
   //Display using Syso
   System.out.println("Using Syso....:");
   System.out.println(""+contries);
   
   //Display using foreach
   System.out.println("Using foreach....:");
   for(String ctry:contries)
   {
	 System.out.println(""+ctry);  
   }
	
   //Display using Iterator
   System.out.println("Using Iterator....:");
   //Iterator : hasNext(),next(),remove()
   Iterator <String> it1=contries.iterator(); 
   while(it1.hasNext())
   {
	  String ctry=it1.next(); 
	  System.out.println(""+ctry);
	  //it1.remove();
   }
   
	
   //Display using ListIterator
   System.out.println("Using ListIterator....:");
   System.out.println("It display Fw:");
   //ListIterator : hasNext(),next(),remove()
   //set(),hasPrevious(),previous(),nextIndex(),previousIndex()
   ListIterator <String>it2=contries.listIterator(); 
   while(it2.hasNext())
   {
	  String ctry=it2.next(); 
	  System.out.println(""+ctry);
	  
   }   
      
   System.out.println("It display Rev:");
   //ListIterator : hasNext(),next(),remove()
   //set(),hasPrevious(),previous(),nextIndex(),previousIndex()
   while(it2.hasPrevious())
   {
	  String ctry=it2.previous(); 
	  System.out.println(""+ctry);
	  
   }   
      
   //for loop
   //Display using ListIterator
   System.out.println("Using for loop....:");
   for(int i=0; i<contries.size();i++)
   {
	   System.out.println(""+contries.get(i));
   } 
   
   
	 
 }//end main
}//end class