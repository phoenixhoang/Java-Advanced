package advprog5;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<PlayerData> playerDataList = new ArrayList<PlayerData>();
		
		PlayerData p1 = new PlayerData("Dan", 12, 20, LocalDate.of(2018, Month.SEPTEMBER, 2), 45, LocalDate.of(2018, Month.APRIL, 5));
		PlayerData p2 = new PlayerData("Billy", 5, 13, LocalDate.of(2017, Month.DECEMBER, 4), 15, LocalDate.of(2017, Month.DECEMBER, 7));
		PlayerData p3 = new PlayerData("Ashe", 17, 46, LocalDate.of(2019, Month.JANUARY, 15), 72, LocalDate.of(2019, Month.JUNE, 17));
		PlayerData p4 = new PlayerData("Candice", 4, 18, LocalDate.of(2015, Month.MAY, 24), 22, LocalDate.of(2020, Month.JANUARY, 8));
		PlayerData p5 = new PlayerData("Timmy", 35, 87, LocalDate.of(2016, Month.JULY, 7), 102, LocalDate.of(2018, Month.APRIL, 26));
		PlayerData p6 = new PlayerData("Gerald", 15, 18, LocalDate.of(2017, Month.NOVEMBER, 3), 62, LocalDate.of(2019, Month.JULY, 11));
		PlayerData p7 = new PlayerData("Serena", 27, 73, LocalDate.of(2017, Month.APRIL, 18), 101, LocalDate.of(2017, Month.AUGUST, 22));
		PlayerData p8 = new PlayerData("Dawn", 38, 85, LocalDate.of(2016, Month.SEPTEMBER, 28), 125, LocalDate.of(2019, Month.NOVEMBER, 17));
		PlayerData p9 = new PlayerData("Rosa", 18, 35, LocalDate.of(2019, Month.JUNE, 15), 73, LocalDate.of(2020, Month.OCTOBER, 29));
		PlayerData p10 = new PlayerData("Yumi", 15, 37, LocalDate.of(2018, Month.JANUARY, 23), 43, LocalDate.of(2019, Month.MARCH, 7));
	
		playerDataList.add(p1);
		playerDataList.add(p2);
		playerDataList.add(p3);
		playerDataList.add(p4);
		playerDataList.add(p5);
		playerDataList.add(p6);
		playerDataList.add(p7);
		playerDataList.add(p8);
		playerDataList.add(p9);
		playerDataList.add(p10);
		
		System.out.println("Original Order: \n" + playerDataList.toString());
		
		Collections.shuffle(playerDataList);
		
		System.out.println("\nRandom Order: \n" + playerDataList.toString());
		
		Collections.sort(playerDataList, new Comparator<PlayerData>()
		{
			@Override
			public int compare(PlayerData p, PlayerData p2)
			{
			
				if (p.getHighScore() > p2.getHighScore())
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
			
		});
	
		System.out.println("\nHighest Score: \n" + playerDataList.toString());
	
		Collections.sort(playerDataList, new Comparator<PlayerData>()
		{
			@Override
			public int compare(PlayerData p, PlayerData p2)
			{
				if (p.getLevel() < p2.getLevel())
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
		});
		
		System.out.println("\nLowest Level: \n" + playerDataList.toString());
		
		Collections.sort(playerDataList, new Comparator<PlayerData>()
		{
			@Override
			public int compare(PlayerData p, PlayerData p2)
			{
				return p2.getLastLogin().compareTo(p.getLastLogin());
			}
		});
		
		System.out.println("\nLatest Login: \n" + playerDataList.toString());
	}
}
