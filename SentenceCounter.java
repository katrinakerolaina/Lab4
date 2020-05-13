package Lab4;

import java.util.Scanner;

/**
"I love Java."
SentenceCounter -- counts the number of words in a given sentence. We assume that a word is separated from another word by ONE single space character.
*/

public class SentenceCounter {

	public static void main(String[] args) {
		
		//declare a variable to store the sentence entered bu the user
		String sentence;
		
		//declare a variable the type Scanner and then create an object of type Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//input
		System.out.println("Please enter the sentence: ");
		sentence = keyboard.nextLine();
		
		//declare 
		int counter = 0;
		int lenght = sentence.length();//the number of chars in sentence
		
		//declare a loop control variable 
		int i = 0;
		
		while (i< lenght) {//while all the chars have not been traversed yet
			//retrieve the char from sentence located at the index i as well 
			//store it into the variable c
			char c = sentence.charAt(i);
			//check whether the current char has a space ' '
			if (c == ' ') {
				counter++;//increase the counter ++ that keeps track of the number of words seen so far
				
			}
			//progression to the next interaction
			i++;
			
			
		}//end while
		
		counter +=1;
		
		//output
		System.out.println("Sentence counter: " + counter);
		

	}//end main

}//end class
