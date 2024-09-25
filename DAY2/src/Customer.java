
public class Customer {
	
	int customerId;
	String custname;
	String city;
	
	public Customer(){
		customerId = 05;
		custname = "ABHI";
		city = "Pune";
	}
	
	public Customer(int id,String name,String ccity) {
		customerId = id;
		custname = name;
		city = ccity;
	}
	
	public void print() {
		System.out.println("Customer name is: "+custname);
		System.out.println("Customer Id:"+customerId);
		System.out.println("Customer city:"+city);

	}
	public static void main(String[] args) {
		
		Customer cm1 = new Customer(46,"LOKESH","NASHIK");
		cm1.print();
		Customer cm2 = new Customer(05,"WADU","GOA");
		cm2.print();

	}

}