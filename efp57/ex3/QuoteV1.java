/*
 * author: poetic_programmer
 * date: 21/07/2016
 *
 * ask user for a quote and an author, echo the results back
 * with the quote nested in quotation marks
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class QuoteV1{
	public static void main(String [] args){
		QuoteV1 program = new QuoteV1();
		
		String quote = program.getQuote();
		String author = program.getAuthor();

		program.echo(author, quote);
	}

	public QuoteV1(){
	}

	public String getQuote(){
		System.out.print("What is the quote? ");
		String result =	"\"" + getUserInput() + "\"";
		
		return result;
	}

	public String getAuthor(){
		System.out.print("\nWho said it? ");
		return getUserInput();
	}

	public void echo(String author, String quote){
		System.out.println("\n" + author + " says, " + quote);
	}

	private String getUserInput(){
		BufferedReader br = 
			new BufferedReader(
					new InputStreamReader(
						System.in));

		String input = "";
		try{
			input = br.readLine();
		} catch(IOException ex) {
			System.out.println("could not read buffer");
			input = "N/A";
		}

		return input;
	}
}
