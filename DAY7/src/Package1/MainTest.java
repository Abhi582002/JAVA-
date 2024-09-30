package Package1;
public class MainTest
{
 public static void main(String[] args) 
 {
     MyShape ref;
     
     ref= new Rectangle(4,2);
     ref.area();
     
     ref= new Circle(5);
     ref.area();
 }
}