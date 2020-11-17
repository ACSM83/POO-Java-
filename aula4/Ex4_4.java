package aula04;
import java.util.Scanner;

public class Ex4_4 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Indique o mês: ");
		int month = in.nextInt();
		System.out.print("Indique o ano: ");
		int year = in.nextInt();
		System.out.println("1 = Domingo, 2 = Segunda, 3 = Terça, 4 = Quarta, 5 = Quinta, 6 = Sexta, 7 = Sábado");
		System.out.print("Indique o dia da semana em que começa o mês: ");
		int dayOfWeek = in.nextInt();
		in.close();
		
		int daysInMonth = CalculateDaysinMonth(month, year);
		String monthName = GetMonthName(month); 
		GetPrintedCalendar(dayOfWeek, daysInMonth, monthName, year);
	}
	
	public static void GetPrintedCalendar(int dayOfWeek, int daysInMonth, String monthName, int year) {
		System.out.println();
		System.out.printf("   %5s %4d\n", monthName, year);
		System.out.print("Su Mo Tu We Th Fr Sa\n");
		
		
		for(int i = 1; i< dayOfWeek; i++) {
			System.out.printf("%3s","");
		}
		
		for (int x = 1; x <= daysInMonth; x++ ) {
			
			System.out.printf("%2s ", x);
			
			if (Math.floorMod(x + (dayOfWeek -1 ), 7) == 0 ) {
				System.out.printf("\n","");
			}
		}
	}

	public static int CalculateDaysinMonth(int month, int year) {
		int daysOfMonth = 1;
	
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				daysOfMonth = 31;
				break;
			case 2:
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					daysOfMonth = 29;
				}else {
					daysOfMonth = 28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				daysOfMonth = 30;
				break;
		}
		return daysOfMonth;
	}
	
	public static String GetMonthName(int month) {
		String monthName="";
		switch (month) {
		case 1:
			monthName="January";
			break;
		case 2:
			monthName="February";
			break;
		case 3:
			monthName="March";
			break;
		case 4:
			monthName="April";
			break;
		case 5:
			monthName="May";
			break;
		case 6:
			monthName="June";
			break;
		case 7:
			monthName="July";
			break;
		case 8:
			monthName="August";
			break;
		case 9:
			monthName="September";
			break;
		case 10:
			monthName="Ocotber";
			break;
		case 11:
			monthName="November";
			break;
		case 12:
			monthName="December";
			break;
	}
	return monthName;
	}
}
