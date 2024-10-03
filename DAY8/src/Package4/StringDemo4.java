package Package4;

public class StringDemo4
{
 public static void main(String[] args) 
 {
    String str="javavavavavava";
    String str2="va";
    
    int count = 0;
    int index = 0;
    
    while((index = str.indexOf(str2,index)) !=-1)
    {
    	count++;
    	index += str2.length();

    }
    System.out.println("The SubString "+str2+" Occured "+count+" times.");
 }
}