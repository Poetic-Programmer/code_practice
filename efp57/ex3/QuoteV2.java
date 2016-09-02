/*
 * author: poetic_programmer
 * date: 21/07/2016
 *
 * creates a map of authors and quotes entered by the user and displays them on completion.
 * there are 2 print methods, one using a collection iterator, the other using a for-each loop 
 * (which is more efficient).
 */

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class QuoteV2{
	public static void main(String [] args){
		QuoteV2 program = new QuoteV2();
		
		program.run();
	}


	private Map<String, String> aqMap; // key is authors name, value is the quote

	public QuoteV2(){
		aqMap = new HashMap<>();
	}

	public void run(){
		boolean quit = false;
		
		// quit when user enters 'n' at the beginning of questioning	
		while(!quit){
			if(addNewValue()){
				System.out.print("What is the quote? ");
				String value = getUserInput(true);
			
				System.out.print("\nWho said it? ");	
				String key = getUserInput(false);

				// place both values in the map to be repeated on exit
				aqMap.put(key, value);
			}

			else{
				quit = true; // satisfy the loop condition
				System.out.println("Here are all the quotes you entered...\n");

				// choose a print function...
				// printAll_V1();
				printAll_V2();
			}
		}
	}

	private void printAll_V1(){
		// Use an iterator to loop through the map
		Iterator it = aqMap.keySet().iterator();

		while(it.hasNext()){
			String key = (String) it.next();
			String value = (String) aqMap.get(key);

			print(value, key);
		}
	}

	private void printAll_V2(){
		// use a for-each loop...
		for(String s : aqMap.keySet()){
			print((String) aqMap.get(s), s);
		}
	}

	private void print(String quote, String author){
		System.out.println(author + " says, " + quote);
	}

	private boolean addNewValue(){

		while(true){
			System.out.print("Add new Value? <Y/N>: ");
			String input = getUserInput(false);

			// ensure only valid input is that suggested by the initial prompt
			if(input.length() == 1){
				char ans = input.charAt(0);

				if(ans == 'y' || ans == 'Y'){
					return true;
				}
				else if(ans == 'n' || ans == 'N'){
					return false;
				}
			}
			
			// If the code has come this far, the input is invalid!
			System.out.println("Please enter appropriate value");
		}
	}



	private String getUserInput(boolean isQuote){
		String input = "";

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		try{
			if(isQuote){
				input = "\"" + br.readLine() + "\"";
			}
			else{
				input = br.readLine();
			}
		} catch (IOException ex){
		}

		return input;
	}
}
