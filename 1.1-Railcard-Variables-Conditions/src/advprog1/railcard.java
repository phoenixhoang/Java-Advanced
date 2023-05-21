package advprog1;

import java.util.Scanner;

public class railcard {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name;
		int age = -99;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		name = in.nextLine(); //read next string
		
		while (age == -99)
		{
			System.out.print("Enter your Age: ");
			if (in.hasNextInt())
				age = in.nextInt();
			in.nextLine(); //clears scanner
		}
		
		in.close();
		
		String railcard16to25, senior, railcard26to30, network, saver16to17;
		String familyAndFriends, disabledPersons, twoTogether, veterans, notAvailable, availability, conditional, separator;
		
		network = "Network Railcard";
		saver16to17 = "16-17 Saver";
		railcard16to25 = "16-25 Railcard";
		railcard26to30 = "26-30 Railcard";
		senior = "Senior Railcard";
		
		familyAndFriends = "Family and Friends Railcard";
		twoTogether = "Two Together Railcard";
		veterans = "Veterans Railcard";
		disabledPersons = "Disabled Persons Railcard";
		
		notAvailable = "You are not eligible for any railcards.";
		separator = ", ";
		
		if (age >= 5 && age <= 15)
		{
			availability = notAvailable;
			conditional = disabledPersons;
		}
		else if (age >= 16 && age <= 17)
		{
			availability = network + separator + saver16to17 + separator + railcard16to25;
			conditional = twoTogether + separator + disabledPersons;
		}
		else if (age >= 18 && age <= 25)
		{
			availability = network + separator + railcard16to25;
			conditional = familyAndFriends + separator + twoTogether + separator + disabledPersons;
		}
		else if (age >= 26 && age <= 30)
		{
			availability = network + separator + railcard26to30;
			conditional = familyAndFriends + separator + twoTogether + separator + disabledPersons;
		}
		else if (age > 30 && age < 60)
		{
			availability = network;
			conditional = familyAndFriends + separator + twoTogether + separator + disabledPersons + separator + veterans;
		}
		else if (age >= 60)
		{
			availability = network + separator + senior;
			conditional = familyAndFriends + separator + twoTogether + separator + disabledPersons + separator + veterans;
		}
		else
		{	
			availability = notAvailable;
			conditional = notAvailable;
		}
		
		
		System.out.print("Hello, " + name + "!" + 
		"\nYou are eligible for the following railcards: " + availability + 
		"\nYou may be eligible for other following railcards: " + conditional);
	}

}
