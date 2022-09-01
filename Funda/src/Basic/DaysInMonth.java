package Basic;

import java.util.Scanner;

//write a java program print total number of days in a month
public class DaysInMonth {

public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the month num 1==jan..12==dec");
int month=sc.nextInt();
if(month==1 || month==3|| month==5||month==7 || month==9 || month==11)
{ System.out.println("month has 31 days");
	}
else if(month==4 || month==6|| month==8|| month==10|| month==12) 
{
	System.out.println("Month has 30 Days");
}
else if(month==2)
{
	System.out.println("Month has 28 Days");
	}
else
	System.out.println("enter the invalid month");

	}

}
