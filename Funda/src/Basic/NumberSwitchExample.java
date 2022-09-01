package Basic;

import java.util.Scanner;

public class NumberSwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the  month num");
int ip=sc.nextInt();
System.out.println("enter the year ");
int year=sc.nextInt();
switch(ip)
{
case 1:
	System.out.println("no of Days is 31");
	break;
case 2: if(year%4==0)
	System.out.println("no of Days is 29");
else
	System.out.println("No od Days is 28 ");
	break;
case 3:
	System.out.println("no of Days is 31");
	break;
case 4:
	System.out.println("no of Days is 30");
	break;
case 5:
	System.out.println("no of Days is 31");
	break;
case 6:
	System.out.println("no of Days is 30");
	break;
case 7:
	System.out.println("no of Days is 31");
	break;
case 8:
	System.out.println("no of Days is 31");
	break;
case 9:
	System.out.println("no of Days is 30");
	break;
case 10:
	System.out.println("no of Days is 31");
	break;
case 11:
	System.out.println("no of Days is 30");
	break;
case 12:
	System.out.println("no of Days is 31");
	break;
	default :
		System.out.println("invalid input");
	
	
	
	
	}

	}

}
