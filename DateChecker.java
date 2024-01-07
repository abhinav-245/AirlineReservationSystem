package AirlineReservationSystem.JavaProject;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.tools.javac.parser.ReferenceParser.ParseException;

public class DateChecker 
{
	public boolean isValid(String date, String flightDate)
	{
		SimpleDateFormat sdfo=new SimpleDateFormat("dd-MM-yyyy");
		Date d1=null;
		try
		{
				d1=sdfo.parse(date);
		}
		catch(java.text.ParseException e)
		{
			e.printStackTrace();
		}
		Date d2=null;
		try
		{
			d2=sdfo.parse(flightDate);
		}
		catch(java.text.ParseException e)
		{
			e.printStackTrace();
		}
		if(d1.compareTo(d2)>0)
		{
			return false;
		}
		else if(d1.compareTo(d2)<0)
		{
			return true;
		}
		else if(d1.compareTo(d2)==0)
		{
			return true;
		}
		return false;
	}
}
