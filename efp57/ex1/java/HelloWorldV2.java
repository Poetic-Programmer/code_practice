/*
 * Author: Poetic Programmer
 * Last Edit: 18/07/2016
 *
 * This Hello World program has the following restraints:
 *   1. No variables to store user input
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HelloWorldV2{
	public static void main(String [] args){
		HelloWorldV2 program = new HelloWorldV2();

		program.displayQuestion();
		program.displayGreeting();
	}

	public HelloWorldV2(){
	}

	public void displayQuestion(){
		System.out.print("What is your name? ");
	}

	public void displayGreeting(){
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		try{
			System.out.println("\nHello " + br.readLine() + ", nice to meet you!");
		} catch(IOException ex){
			System.out.println("I did not catch your name, hello to you nontheless");
		}
	}
}
