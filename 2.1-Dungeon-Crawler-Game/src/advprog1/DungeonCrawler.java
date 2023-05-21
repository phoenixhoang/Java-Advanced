package advprog1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DungeonCrawler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monster skeleton, goblin, witch, dragon;
		Player player1;
		
		skeleton = new Monster ("Skeleton", 2);
		goblin = new Monster ("Goblin", 5);
		witch = new Monster ("Witch", 8);
		dragon = new Monster ("Dragon", 10);
		player1 = new Player (40, 0);
		
		
		String[] monsterList = {"Skeleton", "Skeleton", "Skeleton", "Skeleton",
				"Goblin", "Goblin", "Goblin", "Witch", "Witch", "Dragon"};
		
		ArrayList<String> randomMonsterList = new ArrayList<String>();
		
		char playerChoice = 'y';
		int randomNum;
		
		Scanner in = new Scanner(System.in);
		
		while (playerChoice == 'y')
		{
			System.out.println("Do you think you can handle another monster? (y/n): ");
			playerChoice = in.next().charAt(0);
			
			if (playerChoice == 'y')
			{
				randomNum = (int)(Math.random() * 10);
				randomMonsterList.add(monsterList[randomNum]);
				System.out.println("Monsters in Dungeon:" + randomMonsterList.size());
			}
			else 
			{
				playerChoice = 'n';
			}
		}
		
		int newHealth = 0;
		int newStrength = 0;
		boolean skeletonItem = true; 
		
		for (int i = 0; i < randomMonsterList.size(); i++)
		{
			System.out.println(randomMonsterList.get(i));
			if (randomMonsterList.get(i) == "Skeleton")
			{
				if (skeletonItem == true)
				{
					newHealth = player1.getPlayerHealth();
					player1.setPlayerHealth(newHealth);
					System.out.println("You use your skeleton weapon.");
					System.out.println("Monster " + (i + 1) + " is a skeleton. It deals 0 damage to you, leaving you with " + player1.getPlayerHealth() + " health.");
					
					newStrength = (player1.getPlayerStrength() + skeleton.getMonsterStrength());
					player1.setPlayerStrength(newStrength);
				}
				
				else
				{
					newHealth = (player1.getPlayerHealth() - skeleton.getMonsterStrength());
					player1.setPlayerHealth(newHealth);
					System.out.println("Monster " + (i + 1) + " is a skeleton. It deals " + skeleton.getMonsterStrength() + 
							" damage to you, leaving you with " + player1.getPlayerHealth() + " health.");
					
					newStrength = (player1.getPlayerStrength() + skeleton.getMonsterStrength());
					player1.setPlayerStrength(newStrength);
				}
				
			}
			else if (randomMonsterList.get(i) == "Goblin")
			{
				newHealth = (player1.getPlayerHealth() - goblin.getMonsterStrength());
				player1.setPlayerHealth(newHealth);
				System.out.println("Monster " + (i + 1) + " is a goblin. It deals " + goblin.getMonsterStrength() + 
						" damage to you, leaving you with " + player1.getPlayerHealth() + " health.");
				
				newStrength = (player1.getPlayerStrength() + goblin.getMonsterStrength());
				player1.setPlayerStrength(newStrength);
			}
			else if (randomMonsterList.get(i) == "Witch")
			{
				if (skeletonItem == true)
				{
					skeletonItem = false;
					System.out.println("You lost your skeleton weapon.");
				}
				
				newHealth = (player1.getPlayerHealth() - witch.getMonsterStrength());
				player1.setPlayerHealth(newHealth);
				System.out.println("Monster " + (i + 1) + " is a witch. It deals " + witch.getMonsterStrength() + 
						" damage to you, leaving you with " + player1.getPlayerHealth() + " health.");
				
				newStrength = (player1.getPlayerStrength() + witch.getMonsterStrength());
				player1.setPlayerStrength(newStrength);
			}
			else if (randomMonsterList.get(i) == "Dragon")
			{
				newHealth = (player1.getPlayerHealth() - dragon.getMonsterStrength());
				player1.setPlayerHealth(newHealth);
				System.out.println("Monster " + (i + 1) + " is a dragon. It deals " + dragon.getMonsterStrength() + 
						" damage to you, leaving you with " + player1.getPlayerHealth() + " health.");
				
				newStrength = (player1.getPlayerStrength() + dragon.getMonsterStrength());
				player1.setPlayerStrength(newStrength);
			}
		}
		
		
		if (newHealth > 0)
		{
			System.out.println("Congratulations! You win!");
			System.out.println("Strength: " + player1.getPlayerStrength());
		}
		else
		{
			System.out.println("Too bad! You lose!");
		}
		
		
		in.close();
	}

}
