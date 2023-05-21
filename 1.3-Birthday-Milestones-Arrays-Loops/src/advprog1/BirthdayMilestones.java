package advprog1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class BirthdayMilestones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = -99, month = -99, year = -99;
		
		Scanner in = new Scanner(System.in);
		
		while (day > 31 || day < 1)
		{
			System.out.print("Enter the day of month you were born: ");
			if (in.hasNextInt())
				day = in.nextInt();
			in.nextLine(); //clears scanner
		}
		
		while (month > 12 || month < 0)
		{
			System.out.print("Enter the month you were born: ");
			if (in.hasNextInt())
				month = in.nextInt();
			in.nextLine(); //clears scanner
		}
		
		
		while (year < 1900 || year > 2025)
		{
			System.out.print("Enter the year you were born: ");
			if (in.hasNextInt())
				year = in.nextInt();
			in.nextLine(); //clears scanner
		}
		in.close();
		
		
		boolean leapYear = ((year % 400) != 0) && ((year % 4) == 0);
		
		LocalDate currentDate = LocalDate.now();
		LocalDate birthDate = LocalDate.of(year, month, day);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		int ageYears = Period.between(birthDate, currentDate).getYears();
		int ageMonths = Period.between(birthDate, currentDate).getMonths();
		int ageDays = Period.between(birthDate, currentDate).getDays();
		
		System.out.println("Age: " + ageYears + " Years " + ageMonths + " Months " + ageDays + " Days");

		int nextMilestone = 30;
		int yearsUntil, monthsUntil, daysUntil;
		
		if (ageYears >= 21)
		{
			while (ageYears > nextMilestone)
			{
				nextMilestone = nextMilestone + 10;
			}
			LocalDate nextMilestoneDate = birthDate.plusYears(nextMilestone);
			yearsUntil = Period.between(currentDate, nextMilestoneDate).getYears();
			monthsUntil = Period.between(currentDate, nextMilestoneDate).getMonths();
			daysUntil = Period.between(currentDate, nextMilestoneDate).getDays();
			System.out.println("Next Milestone: " + nextMilestone);
		}	
		else if (ageYears >= 18)
		{
			nextMilestone = 21;
			LocalDate nextMilestoneDate = birthDate.plusYears(nextMilestone);
			yearsUntil = Period.between(currentDate, nextMilestoneDate).getYears();
			monthsUntil = Period.between(currentDate, nextMilestoneDate).getMonths();
			daysUntil = Period.between(currentDate, nextMilestoneDate).getDays();
			System.out.println("Next Milestone: " + nextMilestone);
		}
		else if (ageYears >= 16)
		{
			nextMilestone = 18;
			LocalDate nextMilestoneDate = birthDate.plusYears(nextMilestone);
			yearsUntil = Period.between(currentDate, nextMilestoneDate).getYears();
			monthsUntil = Period.between(currentDate, nextMilestoneDate).getMonths();
			daysUntil = Period.between(currentDate, nextMilestoneDate).getDays();
			System.out.println("Next Milestone: " + nextMilestone);
		}
		else
		{
			nextMilestone = 16;
			LocalDate nextMilestoneDate = birthDate.plusYears(nextMilestone);
			yearsUntil = Period.between(currentDate, nextMilestoneDate).getYears();
			monthsUntil = Period.between(currentDate, nextMilestoneDate).getMonths();
			daysUntil = Period.between(currentDate, nextMilestoneDate).getDays();
			System.out.println("Next Milestone: " + nextMilestone);
		}	
		
		System.out.println("Next Milestone: " + yearsUntil + " Year(s) " + monthsUntil + " Month(s) " + daysUntil + " Day(s)");
	}

}



