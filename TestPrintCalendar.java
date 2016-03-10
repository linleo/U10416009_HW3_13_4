public class TestPrintCalendar 
{
	public static void main(String[] args) 
	{	
		//first parameter
		int month = Integer.parseInt(args[0]);
		//second parameter
		int year = Integer.parseInt(args[1]);
		PrintCalendar calendar = new PrintCalendar();
		calendar.displayCalendar(year, month);
	}
}	
