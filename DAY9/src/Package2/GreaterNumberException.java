package Package2;

public class GreaterNumberException extends Exception 
{
	String msg;
	public GreaterNumberException()
	{
		msg = "GreaterNumberException";
		
	}@Override
	public String toString()
	{
		return msg;
	}
}

