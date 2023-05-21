package advprog2;

public class Restaurant {

	String name;
	private int stockLevel;
	
	Restaurant(String name, int stockLevel)
	{
		this.name = name;
		this.stockLevel = stockLevel;
	}
	
	public String getName()
	{
		return name;		
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getStockLevel()
	{
		return stockLevel;
	}
	
	public void setStockLevel(int stockLevel)
	{
		this.stockLevel = stockLevel;
	}
	
	public void stockUp(int amount)
	{
		this.stockLevel = stockLevel + amount;
	}
	
	public void serveCheeseBurger() throws OutOfStockException
	{
		if (stockLevel < 1)
		{
			throw new OutOfStockException();		
		}
		else
		{
			stockLevel = stockLevel - 1;
			System.out.println("Cheeseburger!");
		}
	}
	
}
