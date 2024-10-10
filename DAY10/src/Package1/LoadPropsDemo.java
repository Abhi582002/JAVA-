package Package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class LoadPropsDemo 
{
	public static void main(String[] args) 
	{
	
		try {
			Properties p = new Properties();
			FileInputStream fin = new FileInputStream("D:\\JAVA Eclipse\\DAY10\\src\\Package1");
			
			p.load(fin);
			
			String url = p.getProperty("url");
			String usernm = p.getProperty("uname");
			String passwd = p.getProperty("password");
			String driver = p.getProperty("driver");
			
			System.out.println("Username: " + url);
			System.out.println("Username: " + usernm);
			System.out.println("Password: " + passwd);
			System.out.println("driver: " +  driver);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}