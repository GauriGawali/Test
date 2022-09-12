package arrays;

public class Movie {
	int movieId,releaseYear,boxOfficeCollection;
	String movieName, producer;
	Movie(int movieId,String movieName,int releaseYear,int boxOfficeCollection,String producer){
		this.movieId=movieId;
		this.movieName=movieName;
		this.releaseYear=releaseYear;
		this.boxOfficeCollection=boxOfficeCollection;
		this.producer=producer;
	}
	public String toString()
	{  
		return"\nmovie id is:"+movieId+"\nMovie Name is"+movieName+"\n Movie Release year:"+releaseYear+"\nMovie box office collection:"+boxOfficeCollection+"\nProducer name is:"+producer;
				}
	}

