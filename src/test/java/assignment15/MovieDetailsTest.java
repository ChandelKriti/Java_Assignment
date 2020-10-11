package assignment15;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class MovieDetailsTest {
	
	ArrayList<Movie_Details> movieDetails = new ArrayList<Movie_Details>();
	Movie_DetailsList md = new Movie_DetailsList();
	Movie_Details md2 = new Movie_Details("Commando","Vidyut","Anushka","Thriller");
	Movie_Details md3 = new Movie_Details("Bhoot","Vicky","Bhoomi","Horror");
	Movie_Details md4 = new Movie_Details("Uri","Vicky","Yami","Patriotic");
	
	@Test
	public void testInsert() {
		
	    assertEquals(1, md.add_movie(md3).size());
	    assertEquals(2, md.add_movie(md2).size());
	    
	  }
	
	@Test
	public void testRemove() {
	
	     md.add_movie(md3);
	     md.add_movie(md2);
	     md.add_movie(md4);
	    assertEquals(2, md.remove_movie(md2).size());
	    
	  }
	
	@Test
	public void testRemoveAll() {
		
	     md.add_movie(md3);
	     md.add_movie(md2);
	     md.add_movie(md4);
	    assertEquals(0, md.remove_AllMovies().size());
	    
	  }
	
	@Test
	public void testFimdMovie() {
		
	     md.add_movie(md3);
	     md.add_movie(md2);
	     md.add_movie(md4);
	     movieDetails.add(md3);
	     movieDetails.add(md4);
	    assertEquals(true, md.find_movie_By_mov_Name(movieDetails,"Commando"));
	    
	  }
	
	
}
