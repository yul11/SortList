package sortList_Comparator;



public class Movie {
	
	String name;
	double rating;
	boolean starred;
	
	public Movie(String n, double r, boolean s) {		
		this.name  = n;
		this.rating = r;
		this.starred=s;		
	}
	
	  
	  
	public String getMovieName(){
		return this.name;
	}
	
	
	public boolean getStarred(){
		return this.starred;
	}
	
	public double getRating(){
		return this.rating;
	}
}
