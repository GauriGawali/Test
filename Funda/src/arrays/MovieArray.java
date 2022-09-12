package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MovieArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
        Movie mov[]=new Movie[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter movieid,moviename,releaseyear,boxOfficeCollection,ProducerName");
			int movieId=sc.nextInt();
			String movieName=sc.next();
			int releaseYear=sc.nextInt();
			int boxOfficeCollection=sc.nextInt();
			String producer=sc.next();
			mov[i]=new Movie(movieId,movieName,releaseYear,boxOfficeCollection,producer);
		}
		//System.out.println(Arrays.toString(mov));

		for(Movie m:mov) {
		if(m.producer.equalsIgnoreCase("karanjohar") && m.boxOfficeCollection>500000){
			{System.out.println(m);}
		}

			}

	}

}
