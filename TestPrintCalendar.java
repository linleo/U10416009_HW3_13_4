import java.util.Scanner;

public class TestPrintCalendar 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter full year (e.g., 2001): ");
		int year = input.nextInt();
		System.out.print("Enter month in number between 1 and 12: ");
		int month = input.nextInt();
		PrintCalendar calendar = new PrintCalendar();
		calendar.displayCalendar(year, month);
	}
}	
