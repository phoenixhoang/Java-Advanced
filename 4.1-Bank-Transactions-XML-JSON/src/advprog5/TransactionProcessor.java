package advprog5;

import java.util.Random;

public class TransactionProcessor implements Runnable{

	public static final int TYPE_DEPOSIT = 0;
	public static final int TYPE_WITHDRAWAL = 1;
	BankAccount account;
	int type;
	int amount;
	
	TransactionProcessor(BankAccount account, int type, int amount)
	{
		this.account = account;
		this.type = type;
		this.amount = amount;
	}
	
	public void performTransaction()
	{
		int newBalance = -999;
		if (type == TYPE_WITHDRAWAL)
		{
			if (amount < 0)
			{
				System.out.println("Cannot withdraw negative amount.");
			}
			else if (amount > account.getBalance())
			{
				System.out.println("Cannot overdraw.");
			}
			else
			{
				newBalance = account.getBalance() + amount;
			}
		}
		else if (type == TYPE_DEPOSIT)
		{
			if (amount < 0)
			{
				System.out.println("Cannot deposit negative amount.");
			}
			else
			{
				newBalance = account.getBalance() - amount;
			}
		}
		else
		{
			System.err.println("Unknown Transaction Type.");
		}
		
		if (newBalance != -999)
		{
			try
			{
				Thread.sleep(new Random().nextInt(20));
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			account.setBalance(newBalance);
		}
	}
	
	public void run()
	{
		this.performTransaction();
	}
	
}
