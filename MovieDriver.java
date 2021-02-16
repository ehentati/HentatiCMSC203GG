import java.util.*;

public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Movie movieInfo = new Movie();
		String confirm = new String();
		
		do{
			
			System.out.println("Enter the title of a movie");
			movieInfo.setTitle(scan.next());
			
			System.out.println("Enter the movie's rating: ");
			movieInfo.setRating(scan.next());
			
			System.out.println("Enter the number of tickets sold at the theater: ");
			movieInfo.setSoldTickets(scan.nextInt());
			
			System.out.println(movieInfo.toString());
			
			System.out.println("Do you want to enter another? (y or n)");
			confirm=scan.next();
			
		}while(confirm.equals("y") || confirm.equals("Y"));
		
		System.out.println("Goodbye");
	}
}
