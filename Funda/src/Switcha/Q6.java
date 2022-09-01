package Switcha;

import java.util.Scanner;

//6.For any integer input not between 1 to 7 it should display "error, day does not exist"
public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no between 1 to 7 to find out the Day");
		int no=sc.nextInt();
		switch(no)
		{ case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Error Day does not exist");
		}

	}

}
