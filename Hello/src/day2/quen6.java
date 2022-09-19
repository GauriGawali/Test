package day2;

import java.util.Scanner;

public class quen6 {
//6. Write a program that displays the day of the week corresponding to the number
//  entered i.e. 1 - "Monday", 2 - "Tuesday" and so on. For any integer input not between 1
//	to 7 it should display "error, day does not exist".
	public static void main(String[] args) {
		// TODO Auto-generated method stub/*
Scanner sc=new Scanner(System.in);
System.out.println("Enter the input between 1 to 7");
int Day=sc.nextInt();
switch(Day)
{
case 1:
	System.out.println("Monday");
	break;
case 2:
	System.out.println("Tuesday");
	//break;
case 3:
	System.out.println("Wednesday");
	//break;
case 4:
	System.out.println("Thursday");
	//break;
case 5:
	System.out.println("Friday");
	//break;
case 6:
	System.out.println("Saturday");
	//break;
case 7:
	System.out.println("Sunday");
    break;

default:
{
	System.out.println("invalid input error, day does not exist");

	


}
}
}

	
		
		/*   Scanner in = new Scanner(System.in);
	        System.out.print("Input number: ");
	        int day = in.nextInt();

	        System.out.println(getDayName(day));
	    }
	 // Get the name for the Week
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }

        return dayName;
    }*/
}