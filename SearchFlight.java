package AirlineReservationSystem.JavaProject;

import java.io.FileNotFoundException;
import java.util.*;

public class SearchFlight 
{
	ArrayList<FlightDetails> list=new ArrayList<FlightDetails>();
	ShowFlightDetails show=new ShowFlightDetails();
	
	public void searchFlight(List<FlightDetails> list1,String deptLoc, String arrivalLoc, String date, String flightClass) throws FileNotFoundException
	{
		for(FlightDetails f: list1)
		{
			if(f.getDepartureLocation().equalsIgnoreCase(deptLoc)&&f.getArrivalLocation().equalsIgnoreCase(arrivalLoc)&&f.getSeatAvl().equalsIgnoreCase("Y")&&(new DateChecker().isValid(date,f.getFlightDate()))&&(f.getFlightClass().equalsIgnoreCase(flightClass)||f.getFlightClass().equalsIgnoreCase("EB"))) 
			{
			FlightDetails d=new FlightDetails(f.getFlightTime(),f.getDepartureLocation(),f.getArrivalLocation(),f.getFlightDate(),f.getFlightTime(),f.getFlightDur(),f.getFare(),f.getSeatAvl(),f.getFlightClass());
			if(list1.get(7).equals("EB"))
			{
				d.setFare(f.getFare()+((0.4)*f.getFare()));
			}
			list.add(d);
			}
		}
	}
	public void sortValues(int choice)
	{
		if(choice==1)
		{
			Collections.sort(list,new Comparator<FlightDetails>() 
			{
				public int compare(FlightDetails o1,FlightDetails o2) 
				{
					return (int)(o1.getFare()-o2.getFare());
				}
			});
		}
		else if(choice==2)
		{
			Collections.sort(list,new Comparator<FlightDetails>()
			{
				public int compare(FlightDetails o1,FlightDetails o2) 
				{
					return (int)(o1.getFlightDur()-o2.getFlightDur());
				}
			});
		}
		else
		{
			System.out.println("You have entered Wrong Choice");
			return;
		}
		show.showDetails(list);
	}	
}
