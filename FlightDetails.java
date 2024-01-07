package AirlineReservationSystem.JavaProject;

public class FlightDetails 
{
	private String flightNo,departureLocation,arrivalLocation,flightDate,flightTime,seatAvl,flightClass;
	double fare,flightDur;
	
	public FlightDetails(String flightNo,String departureLocation,String arrivalLocation,String flightDate,String flightTime,double flightDur,double fare,String seatAvl,String flightClass)
	{
		super();
		this.flightNo=flightNo;
		this.departureLocation=departureLocation;
		this.arrivalLocation=arrivalLocation;
		this.flightDate=flightDate;
		this.flightTime=flightTime;
		this.flightDur=flightDur;
		this.seatAvl=seatAvl;
		this.flightClass=flightClass;
		this.fare=fare;
	}
	public String getFlightNo()
	{
		return flightNo;
	}
	public void setFlightNo(String flightNo)
	{
		this.flightNo=flightNo;
	}
	public String getDepartureLocation()
	{
		return departureLocation;
	}
	public void setDepartureLocation(String departureLocation)
	{
		this.departureLocation=departureLocation;
	}
	public String getArrivalLocation()
	{
		return arrivalLocation;
	}
	public void setArrivalLocation(String arrivalLocation)
	{
		this.arrivalLocation=arrivalLocation;
	}
	public String getFlightDate()
	{
		return flightDate;
	}
	public void setFlightDate(String flightDate)
	{
		this.flightDate=flightDate;
	}
	public String getFlightTime()
	{
		return flightTime;
	}
	public void setFlightTime(String flightTime)
	{
		this.flightTime=flightTime;
	}
	public String getSeatAvl()
	{
		return seatAvl;
	}
	public void setSeatAvl(String seatAvl)
	{
		this.seatAvl=seatAvl;
	}
	public String getFlightClass()
	{
		return flightClass;
	}
	public void setFlightClass(String flightClass)
	{
		this.flightClass=flightClass;
	}
	public double getFlightDur()
	{
		return flightDur;
	}
	public void setFlightDur(double flightDur)
	{
		this.flightDur=flightDur;
	}
	public double getFare()
	{
		return fare;
	}
	public void setFare(double fare)
	{
		this.fare=fare;
	}
}
