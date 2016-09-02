/**
 * @author michael dunleavy
 * @since 08/08/2016
 *
 * <h1> Retirement Calculator </h1>
 * <p> simple app, no input protection </p>
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class RetirementCalculator{
	public static void main(String [] args){
		RetirementCalculator app = new RetirementCalculator();

		/*
		 * set up calendar to todays date in gmt format
		 */
		Locale locale = new Locale.Builder()
			.setLanguage("en")
			.setRegion("UK")
			.build();
		TimeZone timeZone = TimeZone.getTimeZone("GMT");
		Calendar current = new GregorianCalendar(timeZone, locale);

		// get users age. 
		System.out.print("What is your current age? ");
		int age = app.getUserInput();

		// get users desired retirement age
		System.out.print("\nAt what age would you like to reture? ");
		int retAge = app.getUserInput();

		// calculate time to retire
		int toRetire = retAge - age;

		// check the user hasne't exceeded their retirement age
		if( toRetire < 0){
	        	System.out.println(String.format("\nYou could have retired %d years ago", -toRetire));	
		}
		else{
	       		System.out.println(String.format("\nYou have %d years left before you retire", toRetire));	
		}

		// format the calendar to reflect the date now, to when retirement.
		System.out.print(String.format("It's %1$tm/%1$te/%1$tY, you can retire on ", current));
		current.add(GregorianCalendar.YEAR, toRetire);
		System.out.print(String.format("%1$te/%1$tm/%1$tY", current));
	}

	BufferedReader bReader;
	public RetirementCalculator(){
		bReader = new BufferedReader(
				new InputStreamReader(System.in));
	}

	public int getUserInput(){
		int input = 0;
		try{
			input = Integer.valueOf(bReader.readLine());
		} catch (NumberFormatException ex){
			input = 0;
		} catch (IOException ex){
		}

		return input;
	}
}

