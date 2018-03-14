package MyJavaPrograms_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Calendar1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		//Using Date() method
		Date date = new Date();
		//System.out.println("Todays date is(Using Date method): "+date);
		
		//Using SimpleDateFormat() method
		SimpleDateFormat sdf = new SimpleDateFormat();
		//System.out.println("Todays date is(Using SimpleDateFormat method): "+sdf.format(date));
		
		//using specific formats
		sdf = new SimpleDateFormat("EEEE");
		//System.out.println("Todays date is(Using SimpleDateFormat method) with specific format: "+sdf.format(date));
		
		String y = "2018";
		String m = "05";
		String d= "08";
		
		Calendar c = Calendar.getInstance();
		
		int y1 = Integer.parseInt(y);
		int m1 = Integer.parseInt(m);
		int d1= Integer.parseInt(d);
		
		 String dateString = String.format("%d-%d-%d", y1, m1, d1);
	      Date date1 = new SimpleDateFormat("yyyy-M-d").parse(dateString);
	        
	        String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date1).toUpperCase();

		System.out.println(dayOfWeek);
		
	
		
		
		//date to calendar
		
		/*
		c.set(Calendar.YEAR, y1);
		c.set(Calendar.MONTH, m1);
		c.set(Calendar.DATE, d1);
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		*/
		/*String month_name ;
		String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday",
		        "Friday", "Saturday" };
		System.out.println("Current day is : " + strDays[c.get(Calendar.DAY_OF_WEEK) - 1]);*/
		
		/*try
		{
			
		
		int y1 = Integer.parseInt(y);
		int m1 = Integer.parseInt(m);
		int d1= Integer.parseInt(d);
		
		
		
		c.set(Calendar.YEAR, y1);
		c.set(Calendar.MONTH, m1);
		c.set(Calendar.DATE, d1);
		
		
		Date dt = c.getTime();
		System.out.println(dt);
		
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex.getStackTrace());
			
		}*/
		
		
		
		
		
	}

}
