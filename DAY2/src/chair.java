
public class chair
{
	String companyName;
	String colour;
	float price;
	float weight;
	
	public String getCompanyName()
	{
		return companyName;
	}
	
	public void setCompanyName(String cName)
	{
		companyName=cName;
	}
	
	public String getColour()
	{
		return colour;
	}
	
	public void  setColour(String colourName) 
	{
		colour=colourName;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public void setPrice(float pri)
	{
		price=pri;
	}
	
	public float getWeight()
	{
		return weight;
	}
	
	public void setWeight(float wei)
	{
		weight = wei;
	}
	
	public static void main(String[] args) 
	{
		chair ch = new chair();
		ch.setCompanyName("BAJAJ");
		ch.setColour("BLUE");
		ch.setPrice(2400);
		ch.setWeight(2);
		
		System.out.println("Company Name :"+ch.getCompanyName());
		System.out.println("Colour:"+ch.getColour());
		System.out.println("Price is :"+ch.getPrice()+" RS");
		System.out.println("Weight is :"+ch.getWeight()+"KG");
	}

}
