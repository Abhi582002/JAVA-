package Package2;

public class ProperNumberException extends Exception
{
	String msg;
	public ProperNumberException ()
	{
		msg = "ProperNumberException";
	}
	@Override
	public String toString()
	{
		return msg;
	}
}
