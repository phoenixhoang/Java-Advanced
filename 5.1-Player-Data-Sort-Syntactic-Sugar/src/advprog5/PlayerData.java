package advprog5;

import java.time.LocalDate;
import java.time.Month;

public class PlayerData {

	private String name;
	private int level;
	private int highScore;
	private LocalDate creationDate;
	private int playTime;
	private LocalDate lastLogin;
	
	PlayerData(String name, int level, int highScore, LocalDate creationDate, int playTime, LocalDate lastLogin)
	{
		this.name = name;
		this.level = level;
		this.highScore = highScore;
		this.creationDate = creationDate;
		this.playTime = playTime;
		this.lastLogin = lastLogin;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public void setLevel(int level)
	{
		this.level = level;
	}
	
	public int getHighScore()
	{
		return highScore;
	}
	
	public void setHighScore(int highScore)
	{
		this.highScore = highScore;
	}
	
	public LocalDate getCreationDate()
	{
		return creationDate;
	}
	
	public void setCreationDate(LocalDate creationDate)
	{
		this.creationDate = creationDate;
	}
	
	public int getPlayTime()
	{
		return playTime;
	}
	
	public void setPlayTime(int playTime)
	{
		this.playTime = playTime;
	}
	
	public LocalDate getLastLogin()
	{
		return lastLogin;
	}
	
	public void setLastLogin(LocalDate lastLogin)
	{
		this.lastLogin = lastLogin;
	}
	
	public String toString()
	{
		return ("Name: " + name + " Level: " + level + " High Score: " + highScore + " Creation Date: " + creationDate + " Play Time: " + playTime + " Last Login: " + lastLogin);
	}
}

