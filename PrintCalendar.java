import java.util.GregorianCalendar;

public class PrintCalendar
{
	PrintCalendar(){}
	
	//display a specified month calendar
	void displayCalendar(int year, int month)
	{
		GregorianCalendar time = new GregorianCalendar(year, month-1, 1);
		System.out.print("         " + getMonthName(month) + ", " + year + "\n------------------------------\n");
		System.out.print(" Sun Mon Tue Wed Thu Fri Sat\n");
		
		int monthDay = getMonthDay(year, month, time);
		int dayOfWeek = time.get(GregorianCalendar.DAY_OF_WEEK);
		int day = 1;
		for (day=1;day<=(dayOfWeek-1);day++)
		{
			System.out.print("    ");
		}
		
		for (day=1;day<=monthDay;day++)
		{
			System.out.printf("%4d", day);
			if ((day+dayOfWeek-1) % 7 == 0)
				System.out.println();
		}	
	}
	
	//get the name of the month
	String getMonthName(int month) 
	{
		String monthName = "";
		switch (month)
		{
			case 1: monthName = "January"; break;
			case 2: monthName = "February"; break;
			case 3: monthName = "March"; break;
			case 4: monthName = "April"; break;
			case 5: monthName = "May"; break;
			case 6: monthName = "June"; break;
			case 7: monthName = "July"; break;
			case 8: monthName = "August"; break;
			case 9: monthName = "September"; break;
			case 10: monthName = "October"; break;
			case 11: monthName = "November"; break;
			case 12: monthName = "December";
		}
		return monthName;
	}
	
	//get number of day in month
	int getMonthDay(int year, int month, GregorianCalendar time)
	{
		int monthDay = 1;
		
		if (month == 2 && time.isLeapYear(year) == true)
			monthDay = 29;
		else if (month == 2 && time.isLeapYear(year) == false)
			monthDay = 28;
		else
		{
			switch (month)
			{
				case 1: monthDay = 31; break;
				case 3: monthDay = 31; break;
				case 4: monthDay = 30; break;
				case 5: monthDay = 31; break;
				case 6: monthDay = 30; break;
				case 7: monthDay = 31; break;
				case 8: monthDay = 31; break;
				case 9: monthDay = 30; break;
				case 10: monthDay = 31; break;
				case 11: monthDay = 30; break;
				case 12: monthDay = 31;
			}
		}
		return monthDay;
	}
} 
