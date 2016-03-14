public class TestPrintCalendar 
{
	public static void main(String[] args) 
	{	
		//first parameter
		int month = Integer.parseInt(args[0]);
		//second parameter
		int year = Integer.parseInt(args[1]);
		PrintCalendar calendar = new PrintCalendar();
		if (month > 12 || month < 1)
			System.out.print("Month is invalid, must be 1~12");
		else
			calendar.displayCalendar(year, month);
	}
}	
