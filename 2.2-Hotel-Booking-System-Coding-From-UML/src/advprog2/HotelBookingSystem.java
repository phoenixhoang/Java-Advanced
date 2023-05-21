package advprog2;

import java.time.LocalDate;
import java.util.ArrayList;

public class HotelBookingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking booking1, booking2, booking3, booking4, booking5;
		
		LocalDate date1 = LocalDate.of(2021, 01, 02);
		LocalDate date2 = LocalDate.of(2021, 01, 13);
		LocalDate date3 = LocalDate.of(2021, 01, 22);
		LocalDate date4 = LocalDate.of(2021, 02, 05);
		LocalDate date5 = LocalDate.of(2021, 02, 15);
		
		booking1 = new Booking (date1, 7, 90);
		booking2 = new Booking (date2, 14, 67);
		booking3 = new Booking (date3, 25, 75);
		booking4 = new Booking (date4, 25, 58);
		booking5 = new Booking (date5, 25, 79);
		
		ArrayList<Booking> allBookings = new ArrayList<Booking>();
		
		BookingManager bookingManager = new BookingManager(allBookings);
		
		bookingManager.addBooking(booking1);
		bookingManager.addBooking(booking2);
		bookingManager.addBooking(booking3);
		bookingManager.addBooking(booking4);
		bookingManager.addBooking(booking5);
		
		System.out.println(bookingManager.getNumberOfBookings());
		System.out.println(bookingManager.getTotalBookingValue());
		System.out.println(bookingManager.getAllBookings());
		System.out.println(bookingManager.getAllBookingsInMonth("February"));
		
		bookingManager.clearBookings();
		
		System.out.println(bookingManager.getAllBookings());
	}

}
