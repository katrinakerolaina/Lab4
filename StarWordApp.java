package Lab4;
import java.util.*;

public class StarWordApp {

	public static void main(String[] args) {
		
		//declare local variables
		String word, starredWord;
		int choice = 0;
		char rep;
		
		//declare object of type Scanner
		Scanner sc = new Scanner(System.in);
		StarWord myStar = new StarWord();
	
		//input
		//"Please enter a word"
		do {
			word = new String();//" "
		System.out.println("Please enter a word: ");
		word = sc.next();
		word = word.toLowerCase();
		myStar.setWord(word);
		
		//input
		do {
			System.out.println("Please choose method \nVowels = 1\nStars = 2\nPigLating = 3\nReverse = 4: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				myStar.compVowels();
				break;
				
			case 2:
				myStar.compStars();
				break;
				
			case 3:
				myStar.compPig();
				break;
				
			case 4:
				myStar.compReverse();
				break;
				
				default:
					System.out.println("Please check your input!");
		}
		
		}while(choice !=1 && choice !=2 && choice !=3 && choice !=4);
		
		//process
		//output
		starredWord = myStar.getStarWord();
		
		System.out.println("The word: " + word + " with STARRED compute method is " + starredWord);
		System.out.println("Do you wish to continue? y/n ");
		rep = sc.next().charAt(0);
		}while(rep== 'y');
	
	
		
	}//end main

}//end class

