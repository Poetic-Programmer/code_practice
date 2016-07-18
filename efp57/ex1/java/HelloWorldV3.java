/*
 * author: Poetic_Programmer
 * last edit: 19/07/2016
 *
 * this simple hello world program has the following conditions:
 *   1. must recognise certain names
 *
 * note that no consideration is given to performance so each call
 * to read input and compare it to names in a file creates new
 * file readers, buffered readers, etc.
 *
 * notes:
 *   while the test to confirm identity takes care not to differentiate
 *   between upper and lower case, no such care is taken with formatting
 *   the output
 */

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HelloWorldV3{
	public static void main(String [] args){
		HelloWorldV3 program = new HelloWorldV3();

		program.displayQuestion();
		String name = program.getName();
		program.displayGreeting(name);
	}

	public HelloWorldV3(){
	}

	public void displayQuestion(){
		System.out.print("What is your name? ");
	}

	public String getName(){
		return getUserInput();
	}

	public void displayGreeting(String name){
		if(isAvenger(name)){
			System.out.println("Goodmorning agent " + name);
		}
		else{
			System.out.println("Hello, " + name + ", nice to meet you!");
		}
	}

	private boolean isAvenger(String name){
		return inDatabase(name);
	}

	private boolean inDatabase(String name){
		/*
		 * the databse is a text file with all entries assumed
		 * to be in lower case
		 */
		try{
			FileReader fr = new FileReader("files/names.txt");

			BufferedReader br = new BufferedReader(fr);

			String line = "";
			while((line = br.readLine()) != null){
				if(name.toLowerCase().equals(line))
					return true;
			}
		} catch(FileNotFoundException ex){
		} catch(IOException ex){
		}
		return false;
	}


	private String getUserInput(){
		String input = "";
		try{
			BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

			input = br.readLine();
		} catch(IOException ex){
			input = " Unkown ";
		}
		return input;
	}
}
