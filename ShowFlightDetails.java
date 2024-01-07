package AirlineReservationSystem.JavaProject;

import java.util.ArrayList;

public class ShowFlightDetails {
	public void showDetails(ArrayList<FlightDetails> flightList) 
	{
		for(FlightDetails details:flightList)
		{
			System.out.println();
			System.out.print("\t | \t" + details.getDepartureLocation());
			System.out.print("\t | \t" + details.getArrivalLocation());
			System.out.print("\t | \t" + details.getFlightDate());
			System.out.print("\t | \t" + details.getFlightClass());
			System.out.print("\t | \t" + details.getFare());
			System.out.print("\t | \t" + details.getFlightDur());
			System.out.print("\t | \t" + details.getSeatAvl());
		}
		if(flightList.isEmpty())
		{
			System.out.print("Flights are not available right now");
		}
	}
}
