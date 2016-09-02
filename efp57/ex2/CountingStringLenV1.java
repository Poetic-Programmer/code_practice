/*
 * Author: Poetic Programmer
 * date: 19/07/2016
 *
 * console version of a string counting program.
 *
 * note that this program is not concerned with formatting so
 * spaces count as characters.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CountingStringLenV1{
	public static void main(String [] args){
		CountingStringLenV1 program = new CountingStringLenV1();

		// this method will ensure a value is returned.
		String input = program.getUserInput();

		// display the input with length appended.
		program.displayResult(input);
	}

	public CountingStringLenV1(){
	}

	public String getUserInput(){
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		// repeat until user enters a value
		String input = "";
		while(input.length() == 0){
			System.out.print("What is the input string? ");
			try{
				input = br.readLine();
			} catch(IOException ex){
				// Nothing needed
			}
		}
		return input;
	}

	public void displayResult(String input){
		System.out.print("\n" + input + " has " + input.length() + " characters.");
	}
}
