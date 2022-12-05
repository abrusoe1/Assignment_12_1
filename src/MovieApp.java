import java.util.*;

public class MovieApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		
		Set<String> categories = new HashSet<String>(Arrays.asList("drama", "scifi", "horror", "animated"));	// See Line 30
		
		List<Movie> movies = new ArrayList<>();
			movies.add(new Movie ("The Hunt for Red October", "Drama"));
			movies.add(new Movie ("Dune", "Scifi"));
			movies.add(new Movie ("The Thing", "Horror"));
			movies.add(new Movie ("The Nightmare Before Christmas", "Animated"));
			movies.add(new Movie ("Logan", "Drama"));
			movies.add(new Movie ("The Lion King", "Animated"));
			movies.add(new Movie ("The Shining", "Horror"));
			movies.add(new Movie ("Prometheus", "Scifi"));
			movies.add(new Movie ("A Christmas Carol (2009)", "Animated"));
			movies.add(new Movie ("Skyfall", "Drama"));
			
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("There are 10 movies in this list");		// I would've preferred this inside the loop but the console preview says here
		boolean keepGoing = true;
		while (keepGoing)
		{
			System.out.print("What category are you interested in? ");
			String choice = scnr.next();
			String choiceLower = choice.toLowerCase();
			if (categories.contains(choiceLower))
			{
				for (int i = 0; i < movies.size(); i++)
				{
					if (movies.get(i).category.equalsIgnoreCase(choice))
					{
						System.out.println(movies.get(i).title);
					}
				}
			}
			else
			{
				System.out.println("Invalid input. Valid inputs are drama, scifi, horror, and animated");
			}
			
			boolean yn = true;
			while (yn)
			{	
				System.out.print("Continue? (y/n): ");
				String continuing = scnr.next();
				System.out.println(continuing);
				if (continuing.equalsIgnoreCase("n"))
				{
					System.out.println("Goodbye!");
					yn = false;
					keepGoing = false;
				}
				else if (continuing.equalsIgnoreCase("y"))
				{
					yn = false;
				}
				else
				{
					System.out.println("Try again.");
				}
			}
		}
		scnr.close();
	}
}
