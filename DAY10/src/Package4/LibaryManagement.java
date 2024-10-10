package Package4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LibaryManagement 
{

	public static void main(String[] args) 
	{
		ArrayList<library> lib = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int op;

		do 
		{

			System.out.println("Enter 1 to Add Books : ");
			System.out.println("Enter 2 to Search Book: ");
			System.out.println("Enter 3 to Display  Book : ");
			System.out.println("Enter 4 to Update Book : ");
			System.out.println("Enter 5 to to Exit : ");
			
			System.out.println("Enter Your Choice ");
			op = sc.nextInt();

			switch (op) 
			{
				
			case 1:
					
				
				library lib1 = new library();
				System.out.println("Enter Book Id : ");
				lib1.setisbnno(sc.nextInt());
			
				System.out.println("Enter Book name : ");
				lib1.bookName(sc.nextLine());
				sc.nextLine();
				
				System.out.println("Enter auther name:");
				lib1.authorName(sc.nextLine());
				
				break;
				
			case 2:
				
				int search;
				System.out.println("Enter Book Id to Search Book detail : ");
				search = sc.nextInt();
				
				Iterator<library> i = lib.iterator();
				boolean bl = true;
				while(i.hasNext())
				{
					 library lib2 = i.next();
					if(lib2.getisbnno() == search)
					{
						
						System.out.println("\n Book Details :  "+lib2);
						bl= false;
						
					}
			}	
			break;
			
			case 3:
			{
				System.out.println("Books Details......!!!");
				if(lib.isEmpty()) 
				{ 
		            System.out.println("The ArrayList is empty !!!"); 
		        }
		        else 
		        {
		            System.out.println("The ArrayList is not empty"); 
				}
				
				 for (library book: lib) 
				 {
	                 book.display(); 
				 }
	             break;
			}
			
			case 4:
				
                System.out.println("Exiting the program.");
                break;
                
			default:
                System.out.println("Invalid choice. Please try again.");

		}
		}while (op != 4);
		sc.close();
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 