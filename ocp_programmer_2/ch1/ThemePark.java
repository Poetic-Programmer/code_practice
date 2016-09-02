/**
 * @author michael dunleavy
 * @since 28/07/2016
 *
 * <h1> Theme Park </h1>
 *
 * <p> this application will simulate a theme park, taking interest in user activity
 * throughout the course of one year. the results will be shown on screen after the
 * simulation is complete. </p>
 *
 * <p> the simulation does not need to be accurate so 
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class ThemePark{
	public static void main(String [] args){
		ThemePark tp = new ThemePark();

		tp.simulate();
	}

	private static int rollDice(){
		return (int) Math.random() * 6;
	}

	// these will never change, capitalization is the standard naming convention.
	private static final int MIN_DAYLY_VISITORS = 10;
	private static final int MAX_DAYLY_VISITORS = 100;
	
	// static member variables
        private static int totalSpringVisitors = 0; // can be assigned value here, or...

	// assigned in static constructor below.
	private static int summerVisitors;
	private static int autumnVisitors;
	private static int winterVisitors;

	// static constructor.
	static{
		summerVisitors = 0;
		autumnVisitors = 0;
		winterVisitors = 0;
	}

	// Map is part of java collections, no need for linked as values simply get added to and removed from end
	private Map<Integer, String> visitorMap;

	public ThemePark(){
		visitorMap = new HashMap<>(); // diamond operator
	}

	public void addVisitor(Visitor visitor){
//		visitorMap.add(visitor.hashCode, visitor.name);
	}

	public void simulate(){
		// the calendar is used as it provides a nice way to check times of the year for metrics.
		Calendar calendar = new GregorianCalendar(2013, 0, 1);

		for(int i = 0; i < 365; ++i){
			// increment the day of the year
			calendar.add(Calendar.DAY_OF_MONTH, 1);

			System.out.println(String.format("Date: %1$tm %1$td, %1$ty", calendar));

			// get the month to test for season
			int month = calendar.get(Calendar.MONTH);

			int visitorsToday = numberOfVisitors();

			for(int j = 0; j < visitorsToday; ++j){
				Visitor visitor = new Visitor();
			}	
		}
	}

	/**
	 * this method is used to simulate the amount of daily guests.
	 *
	 * @return a random number between the minimum and maximum park capacity 
	 */
	private int numberOfVisitors(){
		return (int) (MIN_DAYLY_VISITORS + ((Math.random() * MAX_DAYLY_VISITORS) - 
				MIN_DAYLY_VISITORS));
	}
	private boolean isWinter(int month){
		return (month == Calendar.JANUARY ||
				month == Calendar.FEBRUARY ||
				month == Calendar.DECEMBER);
	}

	private boolean isAutumn(int month){
		return (month == Calendar.SEPTEMBER ||
				month == Calendar.OCTOBER ||
				month == Calendar.NOVEMBER);
	}

	private boolean isSummer(int month){
		return (month == Calendar.JUNE ||
				month == Calendar.JULY ||
				month == Calendar.AUGUST);
	}

	private boolean isSpring(int month){
		return (month == Calendar.MARCH ||
				month == Calendar.APRIL ||
				month == Calendar.MAY);
	} 
}
