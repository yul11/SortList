package sortList_Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Start {

	public static void main(String[] args) {


		
		
		List<Movie> movies = Arrays.asList(
		        new Movie("Lord of the rings", 8.8, true),
		        new Movie("Back to the future", 8.5, false),
		        new Movie("Carlito's way", 7.9, true),
		        new Movie("Carlito's way", 7.7, true),
		        new Movie("Pulp fiction", 8.9, true),
		        new Movie("Pulp fiction", 8.9, false));

		
		//hier wird sortiert zuerst nach name, dann nach rating und schlieﬂlich nach starred
		movies.sort(Comparator.comparing(Movie::getMovieName)
		                      //.reversed()
		                      .thenComparing(Comparator.comparing(Movie::getRating)
		                      .reversed()
		                      .thenComparing(Comparator.comparing(Movie::getStarred)
		                      .reversed()))
		);

		
		//Ausgabe der sortierten Liste
	    for (Movie m : movies) {
		    System.out.println(m.getMovieName() +" "+ m.getRating() +" "+ m.getStarred());
	    }

	}

}
