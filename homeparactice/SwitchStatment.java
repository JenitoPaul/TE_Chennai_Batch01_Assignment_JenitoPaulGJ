package com.homeparactice;


enum days {
	MONDAY,TUESDAY,WEDNESDAY,
	THRUSDAY,FRIDAY,SATURDAY
}
public class SwitchStatment {

	public static void main(String[] args) {
		
		int a= 10;
		double b=2.5;
		float c = 2.4f;
		String d= "eadvl";
		char e ='e';
		boolean f = false;
		long g = 143756l;
		
		
		switch (b) {
		case 2.5:
			System.out.println(b);
			break;

		default:
			break;
		}
		
		 
		
		switch (days) {
		case MONDAY:
			System.out.println("Monday is first day of week");
			break;
		case TUESDAY:
			System.out.println("Tuesday is first day of week");
			break;
		case WEDNESDAY:
			System.out.println("Wednesday is first day of week");
			break;
		case THRUSDAY:
			System.out.println("thrusday is first day of week");
			break;
		case FRIDAY:
			System.out.println("Friday is first day of week");
			break;
		case SATURDAY:
			System.out.println("Satday is first day of week");
			break;
		case SUNDAY:
			System.out.println("Sunday is first day of week");
			break;	

		default:
			break;
		}
	}
}
