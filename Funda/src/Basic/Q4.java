package Basic;

public class Q4 {
	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		int days,years,months;
		days=1000;
		years=days/365;
		months=(days-(years*365))/12;
		days=days-((years*365)+(months*12));
		System.out.println("number of years days and months is:"+years+" "+days+" "+months+" ");

	}


}
