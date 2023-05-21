package advprog2;

import java.time.LocalDate;
import java.util.ArrayList;

public class BookingManager {
	
	private ArrayList<Booking> bookings = new ArrayList<Booking>();
	
	BookingManager(ArrayList<Booking> allBookings) 
	{
		
	}

	public void addBooking(Booking booking)
	{
		bookings.add(booking);
	}
	
	public int getNumberOfBookings()
	{
		return bookings.size();
	}
	
	public double getTotalBookingValue()
	{
		double totalBookingValue = 0;
		for (int i = 0; i < bookings.size(); i++)
		{
			totalBookingValue = totalBookingValue + bookings.get(i).getTotalCost(); //bookings.get(i).getTotalCost(bookings.get(i).getNumberOfNights(), bookings.get(i).getCostPerNight());
		}
		return totalBookingValue;
	}
	
	public void clearBookings()
	{
		bookings.clear();
	}
	
	public ArrayList<Booking> getAllBookings()
	{
		return bookings;
	}
	
	public ArrayList<Booking> getAllBookingsInMonth(String month)
	{
		ArrayList<Booking> bookingsInMonth = new ArrayList<Booking>();
		for (int i = 0; i < bookings.size(); i++)
		{
			LocalDate currentDate = bookings.get(i).getStartDate();
			for (int j = 0; j < bookings.get(i).getNumberOfNights(); j++)
			{
				if (currentDate.getMonth().toString().equals(month.toUpperCase()))
				{
					bookingsInMonth.add(bookings.get(i));
					break;
				}
				currentDate = currentDate.plusDays(1);
			}
		}
		return bookingsInMonth;
	}
	
}

