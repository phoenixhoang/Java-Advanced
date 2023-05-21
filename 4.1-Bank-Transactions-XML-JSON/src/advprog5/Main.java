package advprog5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread[] tpThreads = new Thread[100];
		
		for (int i = 0; i < 20; i++)
		{
			BankAccount account1 = new BankAccount();
			account1.setAccNumber(1);
			account1.setBalance(10000);
			
			for (int j = 0; j < 100; j++)
			{
				tpThreads[j] = new Thread(new TransactionProcessor(account1, TransactionProcessor.TYPE_WITHDRAWAL, 100));
				tpThreads[j].start();
			}
			
			for (int k = 0; k < 100; k++)
			{
				try
				{
					tpThreads[k].join();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
			System.out.println("Balance: " + account1.getBalance());
		}
	}

}
