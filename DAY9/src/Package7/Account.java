//WAP to crreate Account class with member fields
//account no,name,balance,and member methods default constructor,parameterized constructor,deposit,withdraw amounnt.
//if balance withdraw amount then raise Insufficient constructor,deposit,withdraw amount.if balance withdraw amount 
//then raise InsuffiebtBalanceException.

package Package7;

public class Account
{
 int ano;
 String cname;
 int abal;
 public Account() 
 {
   abal=0;
 }
 public Account(int ano, String cname, int abal) 
 {
	super();
	this.ano = ano;
	this.cname = cname;
	this.abal = abal;
 }
 public void withdraw(int amt) throws InsufficentBalance
 {
	 if(abal<amt)
	 {
		 throw new InsufficentBalance();
	 }
	 abal=abal-amt;
 }
 
 @Override
public String toString() {
	return "Account [ano=" + ano + ", cname=" + cname + ", abal=" + abal + "]";
}
public static void main(String[] args) 
 {
    Account ob= new Account(101,"Amit",20000);
    System.out.println(ob);
    try
    {
		ob.withdraw(25000);
	} catch (InsufficentBalance e) 
    {
		e.printStackTrace();
	}
    System.out.println(ob);
 }
}