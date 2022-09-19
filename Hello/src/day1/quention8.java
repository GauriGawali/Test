package day1;
//8. Write a Java program to convert days into years, weeks and days.
public class quention8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days,years,weeks;
		days=1000;
		years=days/365;
		weeks=(days-(years*365))/7;
		days=days-((years*365)+(weeks*7));
		System.out.println("number of years daysand weeks is:"+years+" "+days+" "+weeks+" ");

	}

}
