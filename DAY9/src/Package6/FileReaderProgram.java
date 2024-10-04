package Package6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderProgram 
{
 public static void main(String[] args) throws IOException 
 {
  FileInputStream fis= null;
  try
  {
    fis= new FileInputStream("D:\\JAVA Eclipse\\DAY9\\src\\Package6\\f1.txt");
    int data=0;
    while((data=fis.read())!=-1)
    {
    	if((char)data=='z')
    		throw new SecurityException("Testing...");
      System.out.print(""+(char)data);	
    }
   
  }
  catch(FileNotFoundException e) 
  {
	e.printStackTrace();
  }//end catch
 }//end main
}//end class