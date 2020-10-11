package assignment15;

import java.util.ArrayList;

public class Movie_DetailsList {

	/*Movie_Details md1 = new Movie_Details("3 idiots","Amir","Karina","Comedy");
	Movie_Details md2 = new Movie_Details("Commando","Vidyut","Anushka","Thriller");
	Movie_Details md3 = new Movie_Details("Bhoot","Vicky","Bhoomi","Horror");
	Movie_Details md4 = new Movie_Details("Uri","Vicky","Yami","Patriotic");*/
	
	ArrayList<Movie_Details> movieDetails = new ArrayList<Movie_Details>();
	
	public 	ArrayList<Movie_Details> add_movie(Movie_Details md) {
		
		movieDetails.add(md);
		return movieDetails;
	}
	
	public ArrayList<Movie_Details> remove_movie(Movie_Details md) {
		movieDetails.remove(md);
		return movieDetails;
	}
	
	public ArrayList<Movie_Details> remove_AllMovies() {
		movieDetails.clear();
		return movieDetails;
	}
	
	public boolean find_movie_By_mov_Name(ArrayList<Movie_Details> movieDetails , String movie) {
		for(Movie_Details md : movieDetails) {
		if(md.getMov_Name() != null && md.getMov_Name().contains(movie));
		return true;
		}
		return false;
	}
	
	public boolean find_movie_By_Genre(ArrayList<Movie_Details> movieDetails , String genre) {
		for(Movie_Details md : movieDetails) {
			if(md.getGenre() != null && md.getGenre().contains(genre));
			return true;
			}
		return false;
	}
 	
	
}
