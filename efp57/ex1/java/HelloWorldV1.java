/*
 * Author: Poetic Programmer
 * Last Edit: 18/07/2016
 *
 * This simple program demonstrates basic competency with the java 
 * programming language. It asks the user for their name and displays
 * a friendly greeting. There are restraints in the design, namely:
 *    1. keep the input, string concatenation, and output separate.
 * 
 * The program uses extremely basic error handling, there are no tests
 * for checking valid user input, there is however tests to ensure the 
 * program gets some form of input.
 *
 * This is an exersize from the book:
 *   Exercises for Programmers by Brian P. Hogan
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HelloWorldV1{
	public static void main(String [] args){
		HelloWorldV1 program = new HelloWorldV1();
		
		program.displayQuestion();	
		String name = program.getName();
		program.displayGreeting(name);
	}

	public HelloWorldV1(){
	}
	
	public void displayQuestion(){
		System.out.print("What is your name? ");
	}

	public String getName(){
		String name;

		try{
			name = getUserInput();
		}
		catch(NullPointerException ex) {
			name = "John Doe";
		}

		return name;
	}


	public void displayGreeting(String name){
		System.out.println("Hello, " + name + ", nice to meet you!");
	}

	private String getUserInput() throws NullPointerException{
		try{
			/*
			 * Create the buffered reader (default size) and read from
			 * the character input stream. decode using inputstreamreader
			 */
			BufferedReader br = new BufferedReader(
				       new InputStreamReader(System.in));
			
			return br.readLine();
		}
		catch (IOException ex) {}

		return null;
	}	
}
