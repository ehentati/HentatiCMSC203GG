
/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Takes user through a process of inputs and outputs to diagnose a Wifi issue
 * Due: 2/09/2021
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Elyes Hentati
*/
import java.util.*;

/*
 * creates a class that runs a program that performs a basic Wifi Dianosis
 */
public class WifiDiagnosis{
	
	public static void main(String[] args) {
		
		/*
		 * these strings represent the steps the program takes
		 * to perform the diagnosis
		 */
		String one= "Reboot your computer";
		String two="Reboot your router";
		String three="Make sure the cables are plugged in firmly to your router";
		String four="Move your computer closer to the router";
		
		//placeholder for the input
		String answer;
		
		//signature
		String outro="This program was created by Elyes Hentati";
		
		/*
		 * puts the steps into an ArrayList for easier manipulation
		 */
		ArrayList<String> possibilities= new ArrayList<String>();
		
		possibilities.add(one);
		possibilities.add(two);
		possibilities.add(three);
		possibilities.add(four);
		
		Scanner scan= new Scanner(System.in);
		
		//to be printed every time the program runs
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work: " + '\n');
		
		/*
		 * This loop will run through every step the WifiDiagnosis provides
		 */
		for(int i=0;i<4;i++) {
			
			//calls the method askQuestion to 
			System.out.println(askQuestion(i,possibilities.get(i)));
			answer=scan.next();

			//checks if user input is valid
			while(!answer.equals("no") && !answer.equals("yes")) {
				
				
			System.out.println("You entered: "+answer+", Please enter valid input (yes or no)");
			answer=scan.next();
			
			}
			
			//prints exit message and exits program if user is satisfied
			if(answer.equals("yes")) {
				
				System.out.println(possibilities.get(i) + ": this solution seemed to work!");
				System.out.println(outro);
				System.exit(i);
			}
		}
		
		//last resort if all steps fail
		System.out.println("Please Contact Your ISP");
		System.out.println(outro);
		System.exit(0);
	}
	
	/*
	 * This method, askQuestion, takes in an integer and a string
	 * to find out which step the program is currently on
	 * and print out the required output
	 */
	public static String askQuestion(int step, String task) {

		String question= "Are you able to connect to the Internet? (yes/no)";
		
		if(step==0) {
			return "First step: " + task + '\n' + question;
		}
		else if(step==1) {
			return "Second step: " + task + '\n' + question;
		}
		else if(step==2) {
			return "Third step: " + task + '\n' + question;
		}
		else{
			return "Fourth step: " + task + '\n' + question;
		}
		
	}
	
}