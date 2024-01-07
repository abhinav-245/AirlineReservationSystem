package AirlineReservationSystem.JavaProject;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FlightMain 
{
	public static void main(String[] args)
	{
		ArrayListData data=new ArrayListData();
		
		Scanner scanner=new Scanner(System.in);
		String departureLocation,arrivalLocation,flightClass,flightDate;
		int choice;
		System.out.println("Enter Departure location: ");
		departureLocation=scanner.nextLine();
		System.out.println("Enter arrival location: ");
		arrivalLocation=scanner.nextLine();
		System.out.print("Enter 'B' for business class and 'E' for economic class: ");
		flightClass=scanner.nextLine().toUpperCase();
		System.out.println("Enter flight date: ");
		flightDate=scanner.nextLine();
		System.out.println("What do you prefer to see\n 1.Fare \n 2.Fare and Duration: ");
		choice=scanner.nextInt();
		SearchFlight fd=new SearchFlight();
		try
		{
			fd.searchFlight(data.getArray(),departureLocation,arrivalLocation,flightDate,flightClass);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		fd.sortValues(choice);
		scanner.close();
	}
} 
