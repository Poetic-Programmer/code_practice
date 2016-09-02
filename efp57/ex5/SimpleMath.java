/**
 * @author michael dunleavy
 * @since 07/08/2016
 *
 * <h1> Simple Math </h1>
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimpleMath{
	public static void main(String [] args){
		SimpleMath app = new SimpleMath();

		app.run();
	}

	BufferedReader bReader;
	
	public SimpleMath(){
		bReader = new BufferedReader(
				new InputStreamReader(System.in));
	}

	public void run(){
		boolean validInput = false;
		float inputA = 0;
		float inputB = 0;
		
		/*
		 * if user enters an invalid number, the process will start at the begginning,
		 * this approach was chosen as it is more compact. Could be put in separate 
		 * function.
		 */
		while(!validInput){
			try{
				System.out.print("what is first number? ");
				inputA = getUserInput();
				if(!isPositive(inputA)) continue;
				System.out.print("what is second number? ");
				inputB = getUserInput();
				if(!isPositive(inputB)) continue;
				validInput = true;
			} catch (NullPointerException ex) {
			}	
		}

		printResults(inputA, inputB);
	}

	private boolean isPositive(float number){
		return (number >= 0);
	}
	private void printResults(float inputA, float inputB){
		String output =
		       	Float.toString(inputA) + " + " + Float.toString(inputB) + " = " + Float.toString((inputA + inputB)) + "\n" +
			Float.toString(inputA) + " - " + Float.toString(inputB) + " = " + Float.toString((inputA - inputB)) + "\n" +
			Float.toString(inputA) + " * " + Float.toString(inputB) + " = " + Float.toString((inputA * inputB)) + "\n" +
			Float.toString(inputA) + " / " + Float.toString(inputB) + " = " + Float.toString((inputA / inputB)) + "\n";

		System.out.print(output);
	}

	private float getUserInput() throws NullPointerException{
		Float input = null; // use boxed primitive as it can be nullified

		try{
			input = Float.valueOf(bReader.readLine());	
		} catch ( NumberFormatException ex ){
			// add warning for debug purposes
			System.out.println("not a number!");
		} catch ( IOException ex){
		}

		return input; // java will handle the unboxing for us
	}
}
