package Basic;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		
		int year=sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("Given Year is leap");
			
		}
		else
			
		System.out.println("year is not leap");

	}

}

