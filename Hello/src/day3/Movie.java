package day3;

public class Movie {
	
	
	int yearOfRelease;
	float profit;
	String producerName,actorName;
	void acceptdetails(int y,float p,String pr,String a)
	{
		yearOfRelease=y;
		profit=p;
		producerName= pr;
		actorName= a;
		
		}
	void showDetails()
	{
		System.out.println("movie profit in rs" +profit);
		System.out.println("movie profit in " +producerName);
		System.out.println("movie profit in " +actorName);
		System.out.println("movie profit in " +yearOfRelease);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Movie titanic=new Movie();
titanic.showDetails();
titanic.acceptdetails(1997, 111002, "mrJeams", "Leonardeo");
System.out.println("after calling acceptdetails,state of tatanic object");
titanic.showDetails();

Movie uri=new Movie();
uri.acceptdetails(2019,15798423,"mrBeans","vikcy");
System.out.println("details of uri object");
uri.showDetails();

	}

}
