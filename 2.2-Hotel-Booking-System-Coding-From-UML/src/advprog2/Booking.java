package advprog2;

import java.time.LocalDate;

public class Booking {

	private LocalDate startDate;
	private int numberOfNights;
	private double costPerNight;
	
	Booking(LocalDate startDate, int numberOfNights, double costPerNight)
	{
		this.startDate = startDate;
		this.numberOfNights = numberOfNights;
		this.costPerNight = costPerNight;
	}
	
	public LocalDate getStartDate()
	{
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate)
	{
		this.startDate = startDate;
	}
	
	public int getNumberOfNights()
	{
		return numberOfNights;
	}
	
	public void setNumberOfNights(int nights)
	{
		this.numberOfNights = nights;
	}
	
	public double getCostPerNight()
	{
		return costPerNight;
	}
	
	public void setCostPerNight(double cost)
	{
		this.costPerNight = cost;
	}
	
	public double getTotalCost()
	{
		return (numberOfNights * costPerNight);
	}
	
	public String toString()
	{
		return ("\nStart date: " + startDate + " Number of Nights: " + numberOfNights + " Cost Per Night: " + costPerNight);
	}
}
