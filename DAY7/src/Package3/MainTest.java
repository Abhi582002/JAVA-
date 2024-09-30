package Package3;

public class MainTest
{
 public static void main(String[] args) 
 {
     MyShape ref;
     ref= new Rectangle(4,2);
     ref.area();
     ((Printable)ref).print(); //type cast
     
     
     Printable ref2;
     ref2= new Rectangle(4,2);
     ((MyShape)ref2).area(); //type cast
     ref2.print(); 
  }
}