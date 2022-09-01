package Basic;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the city Name");
		String city=sc.next();
		String choice="";
		
		if(city.equals("Delhi"))
		{
			System.out.println("Choice airline to visit");
			System.out.println("indio");
			System.out.println("kingfisher");
		System.out.println("enter your choice");
		choice=sc.next();
		
		
		if(choice.equals("indigo"))
		{
			int price=50000;
			System.out.println("welcome to indigo airlines");
			System.out.println("you getting 10 percent discount on ticket fair");
			price=price-price*10/100;
			
			System.out.println("your ticket fair is"+price);
		System.out.println("thanks for visiting");
		
		}
		
		if(choice.equals("kingFisher"))
		{
			int price=15000;
			System.out.println("welcome to Kingfisher airlines");
			System.out.println("you getting 20 percent discount on ticket fair");
			price=price-price*20/100;
			
			System.out.println("your ticket fair is"+price);
		System.out.println("thanks for visiting");
		
		}
		}

	}

}
