package advprog1;

public class Player {
	private int playerHealth;
	private int playerStrength;

	Player (int playerHealth, int playerStrength)
	{
		this.playerHealth = playerHealth;
		this.playerStrength = playerStrength;
	}
	
	// Getter
	public int getPlayerHealth() 
	{
		return playerHealth;
	}
		
	public int getPlayerStrength() 
	{
		return playerStrength;
	}

	// Setter
	public void setPlayerHealth(int newHealth) 
	{
		this.playerHealth = newHealth;
	}
		
	public void setPlayerStrength(int newPlayerStrength) 
	{
		this.playerStrength = newPlayerStrength;
	}
		
		
		
}
