
public class MobileDevice
{
	String companyName;
	String modelName;
	float price;
	int ram;
	
	public String getCompanyName()
	{
		return companyName;
	}
	
	public void setCompanyName(String cName)
	{
		companyName=cName;
	}
	
	public String getModelName()
	{
		return modelName;
	}
	
	public void  setModelName(String modName) 
	{
		modelName=modName;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public void setPrice(float pri)
	{
		price=pri;
	}
	
	public int getRam()
	{
		return ram;
	}
	
	public void setRam(int rm)
	{
		ram = rm;
	}
	
	public static void main(String[] args) 
	{
		MobileDevice Md = new MobileDevice();
		Md.setCompanyName("VIVO");
		Md.setModelName("T2 PRO");
		Md.setPrice(24000);
		Md.setRam(8);
		
		System.out.println("Company Name :"+Md.getCompanyName());
		System.out.println("model Name :"+Md.getModelName());
		System.out.println("Price is :"+Md.getPrice()+" RS");
		System.out.println("Ram is :"+Md.getRam()+"GB");
	}

}
