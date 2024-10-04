package Package7;

public class InsufficentBalance extends Exception 
{
  String msg;
  public InsufficentBalance() 
  {
	msg="InsufficentBalance.....!!!";
  }
  public InsufficentBalance(String msg) 
  {
	this.msg = msg;
  }
  @Override
  public String toString() 
  {
	return "IBExeption:"+msg;
  }
  @Override
  public String getMessage()
  {
	  return msg;
  }
}