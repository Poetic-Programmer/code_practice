/**
 * @author michael dunleavy
 * @since 28/07/2016
 *
 * <h1> Mad Lib Program </h1>
 *
 * <p> shows by a simple example, how to use the formatted string method. </p>
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App{
	public static void main(String [] args){
		App app = new App();


		app.askForNoun();
		String noun = app.getInput();

		app.askForVerb();
		String verb = app.getInput();

		app.askForAdjective();
		String adjective = app.getInput();

		app.askForAdverb();
		String adverb = app.getInput();

		String output = String.format("Do you %s your %s %s %s? that's funny", verb, adjective, noun, adverb);

		System.out.println(output);
	}

	BufferedReader bufferedReader;

	public App(){
		bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
	}

	public String getInput(){
	    String input = "";
		try{
	    		input = bufferedReader.readLine();
		}
		catch (IOException ex){
			}


		return input;
	}		

	public void askForNoun(){
		System.out.print("\nEnter a noun: ");
	}
	public void askForVerb(){
		System.out.print("\nEnter a verb: ");
	}
	public void askForAdjective(){
		System.out.print("\nEnter an adjective: ");
	}
	public void askForAdverb(){
		System.out.print("\nEnter an adverb: ");
	}
}
