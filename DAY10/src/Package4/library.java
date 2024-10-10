package Package4;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class library
{
	private int isbnno;
	private String bookName;
	private String authorName;
	
	public library()
	{
		
	}

	public library(int isbnno,String bookName,String authorName)
	{
		this.isbnno = isbnno;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	
	public int getisbnno()
	{
		return isbnno;
	}
	
	public void setisbnno(int isbnno)
	{
		this.isbnno = isbnno;
	}
	
	public String bookName()
	{
		return bookName;
	}
	
	public void bookName(String bookName)
	{
		this.bookName = bookName;
	}
	
	public String authorName()
	{
		return authorName;
	}
	
	public void authorName(String authorName)
	{
		this.authorName = authorName;
	}
	
	@Override
	public String toString()
	{
		return "library [No=" +isbnno +", BookName=" + bookName +",Author Name "+ authorName+ "]";
	}

	public void display() 
	{
		 System.out.println("Book ID: " + isbnno);
	     System.out.println("Book Name: " + bookName);
	     System.out.println("Author Name: " + authorName);		
	}
	
	

}




















