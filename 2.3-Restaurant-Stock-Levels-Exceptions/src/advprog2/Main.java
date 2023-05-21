package advprog2;

public class Main {
	public static void main(String[] args)
	{
		
		int randomNum = (int)(Math.random() * 10) + 1;  // 0 to 100
		
		Restaurant restaurant1 = new Restaurant ("Cheeseburger Only", randomNum);
		
		try
		{
			for (int i = 0; i < 11; i ++)
			{
				restaurant1.serveCheeseBurger();
			}
		}
		catch (OutOfStockException tte)
		{
			System.err.println("Out of Stock.");
		}
			
	}

}
