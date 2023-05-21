package advprog1;

public class Monster {
	//Members
	private String monsterName;
	private int monsterStrength;
	
	//Constructor
	Monster(String monsterName, int monsterStrength)
	{
		this.monsterName = monsterName;
		this.monsterStrength = monsterStrength;
	}
	
	// Getter
	public String getMonsterName() 
	{
		return monsterName;
	}
	
	public int getMonsterStrength() 
	{
		return monsterStrength;
	}

	// Setter
	public void setMonsterName(String newName) 
	{
		this.monsterName = newName;
	}
	
	public void setMonsterStrength(int newStrength) 
	{
		this.monsterStrength = newStrength;
	}
	
}
