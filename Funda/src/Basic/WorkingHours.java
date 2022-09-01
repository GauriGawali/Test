package Basic;

import java.util.Scanner;

/*In a company named Micky software solution, many part-time employees are working for a pay of Rs. 100 per hour. 
Write a program to calculate the total amount an employee earns in a year by working part time. 
Consider employees should work all day in the year and year has 365 days.

Note : The hour should be a positive value less than or equal to 24, if fails display "Unable to calculate the earnings"

Sample Input 1:
Enter no of hours worked in a day:3

Sample Output 1:
Total income in a year:109500*/
public class WorkingHours {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The Sample input 1");
        System.out.println("Enter the per Day working hours of employees");
        int php=100;
        int year=365;
        int Hour=sc.nextInt();
        int income=php*year*Hour;
        System.out.println("Sample output 1");
        System.out.println("Total income in year:"+income);
	}

}
