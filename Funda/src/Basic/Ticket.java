package Basic;

import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the theater Name");
	String thr=sc.next();
	System.out.println("Enter the Movie Name");
	String mv=sc.next();
	System.out.println("Enter the Price");
    int price=sc.nextInt();
    System.out.println("Enter the coupon code");
    String code=sc.next();
    System.out.println("theater Name is"+thr);
    System.out.println("movie name is"+mv);
    System.out.println("ticket price is"+price);
    
    if(code.equals("Gold"))
    {
    	price=price-price*10/100; 
    	System.out.println("the ticket price is:"+price);
    }
    else if(code.equals("Platinum"))
    {
    	price=price-price*5/100;
    	System.out.println("The ticket price is:"+price);
    }
    else if(code.equals("Silver"))
    {
    	price=price-price*8/100;
    	System.out.println("The ticket price is"+price);
    }
    else
    	System.out.println(price);
	}

}
