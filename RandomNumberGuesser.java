
/*
 * Elyes Hentati
 * Grinberg CMSC203
 * Assignment 2 Random Number Guesser
 * This program plays a game where the user tries
 * to guess a random number between 0 and 100
 * 
 */
import java.util.*;

public class RandomNumberGuesser{

	public static void main(String[] args) {
		
		//necessary variables
		int nextGuess=0;
		int highGuess=100;
		int lowGuess=0;
		RNG guesser = new RNG();
		int randNum=guesser.rand();
		String replay = "yes";
		
		
		Scanner scan = new Scanner(System.in);
		
		//main loop that runs the game
		do {
			
			//takes input from user
			System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
			nextGuess=scan.nextInt();
			
			//prints the number of current attempts
			System.out.println("Number of guesses is " + guesser.getCount());
			
			//checks if user input is valid
			if(guesser.inputValidation(nextGuess, lowGuess, highGuess)) {
				
				//if the user is too high
				if(nextGuess>randNum) {
					System.out.println("Your guess is too high");
					highGuess=nextGuess;
				}
				
				//if the user is too low
				else if(nextGuess<randNum) {
					System.out.println("Your guess is too low");
					lowGuess=nextGuess;
				}
				
				//if the answer is correct
				else {
					
					System.out.println("Congratulations, you guessed correctly");
					
					//reset all important variables
					guesser.resetCount();
					lowGuess=0;
					highGuess=100;
					
					//create a new random number
					randNum=guesser.rand();
					
					//validate user input
					do {
						
						System.out.println("Try again? (yes or no)");
						replay = scan.next();
						
						if(!replay.equals("yes") && !replay.equals("no")) {
							System.out.println("Enter a valid answer");
						}
						
					} while( !replay.equals("yes") && !replay.equals("no"));	
				}
			}
			
		}while(replay.equals("yes"));
		
		System.out.println("Thanks for playing! " + '\n' + "Made by Elyes Hentati");
		System.exit(0);
	}
}
